package org.softwareonpurpose.softwaregauntlet;

import com.softwareonpurpose.calibrator4test.Calibrator;
import com.softwareonpurpose.uinavigator.web.WebUiHost;
import com.tekgs.astro.behavior.ToStringBehavior;
import org.apache.commons.io.FileUtils;
import org.softwareonpurpose.coverage4test.CoverageReport;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Test
public abstract class GauntletTest {
    private static final CoverageReport reportManager = CoverageReport.getInstance();
    private final List<String> requirements = new ArrayList<>();
    private String feature;
    private String testName;
    
    @BeforeClass(alwaysRun = true)
    protected void initialize() {
        feature = this.getClass().getSimpleName().replace("Tests", "");
    }
    
    @BeforeMethod(alwaysRun = true)
    protected void initializeTest(Method method) {
        driverInstantiation();
        testName = method.getName();
        System.out.printf("Executing %s...%n", testName);
    }
    
    @AfterMethod(alwaysRun = true)
    protected void terminateTest(ITestResult result) {
        Object[] scenarios = result.getParameters();
        scenarios = scenarios.length == 0 ? null : scenarios;
        String feature = result.getTestClass().getRealClass().getSimpleName().replace("Tests", "");
        if (!requirements.isEmpty()) {
            for (String requirement : requirements) {
                reportManager.addRequirementTestEntry(testName, feature, scenarios, requirement);
            }
        } else {
            reportManager.addTestEntry(testName, feature, scenarios);
        }
        WebUiHost.quitInstance();
    }
    
    @AfterClass(alwaysRun = true)
    protected synchronized void reportClass() {
        String coverageFolder = "build/reports/coverage";
        File systemReport = new File(String.format("%s/system/%s.system.rpt", coverageFolder, feature));
        File requirementsReport = new File(String.format("%s/requirements/%s.requirements.rpt", coverageFolder, feature));
        try {
            FileUtils.writeStringToFile(systemReport, reportManager.getSystemCoverage(), StandardCharsets.UTF_8);
            FileUtils.writeStringToFile(requirementsReport, reportManager.getRequirementsCoverage(), StandardCharsets.UTF_8);
            boolean newFile = systemReport.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    protected void when() {
        System.out.printf("WHEN:%n");
    }
    
    /*
    * Original version for printing numerous 'givens' <- refactor
    */
//    protected void given(Object... testData) {
//        String keyWord = "GIVEN";
//        for (Object dataItem : testData) {
//            String dataDescription = dataItem == null ? "<NULL>" : dataItem.toString();
//            System.out.printf("%s: %s%n", keyWord, dataDescription);
//            keyWord = "  AND";
//        }
//    }
    
    protected void given(Object testData) {
        String testDataDescription = testData == null ? "<NULL>" : ToStringBehavior.getInstance(testData).execute();
        System.out.printf("GIVEN:%n%s", testData == null ? "" : testData.getClass().getSimpleName());
        System.out.println(testDataDescription);
    }
    
    protected void then(Calibrator calibrator) {
        Assert.assertEquals(calibrator.calibrate(), Calibrator.SUCCESS);
    }
    
    protected void addRequirements(String... requirements) {
        this.requirements.addAll(Arrays.asList(requirements));
    }
    
    protected void driverInstantiation() {
        WebUiHost.getInstance(ChromeUiDriver.getInstance());
    }
    
    public enum View {
        ;
        public static final String LANDING = "landing";
        
        public static final String LOGIN = "login";
        public static final String DEMOGRAPHICS = "demographics";
        public static final String CHART = "chart";
        public static final String HOROSCOPE = "horoscope";
        public static final String COMPATIBILITY = "compatibility";
        public static final String SIGN_DETAILS = "sign-details";
        public static final String MEMBER_LANDING = "member-landing";
    }
    
    public enum Application {
        ;
        public static final String ASTRO_TEK = "AstroTEK";
    }
    
    public enum Data {
        ;
    }
    
    public static class TestSuite {
        public static final String SMOKE = "smoke";
        public static final String RELEASE = "release";
        public static final String ACCEPTANCE = "acceptance";
        public static final String DEBUG = "debug";
    }
}
