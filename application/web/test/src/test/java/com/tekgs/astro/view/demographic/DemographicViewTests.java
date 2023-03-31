package com.tekgs.astro.view.demographic;

import com.tekgs.astro.demographic.DemographicView;
import com.tekgs.astro.demographic.DemographicViewCalibrator;
import com.tekgs.astro.demographic.DemographicViewExpected;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.DEMOGRAPHIC})
public class DemographicViewTests extends GauntletTest{
    @Test(groups = {TestSuite.SMOKE, TestSuite.DEBUG})
    public void smoke() {
        DemographicViewExpected expected = DemographicViewExpected.getInstance();
        DemographicView actual = DemographicView.directNav();
        then(DemographicViewCalibrator.getInstance(expected, actual));
    }
}
