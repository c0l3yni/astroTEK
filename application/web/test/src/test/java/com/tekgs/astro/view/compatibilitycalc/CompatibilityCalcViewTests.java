package com.tekgs.astro.view.compatibilitycalc;

import com.tekgs.astro.view.compatabilitycalc.CompatibilityCalcView;
import com.tekgs.astro.view.compatabilitycalc.CompatibilityCalcViewCalibrator;
import com.tekgs.astro.view.compatabilitycalc.CompatibilityCalcViewExpected;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.COMPATIBILITY_CALC})
public class CompatibilityCalcViewTests extends GauntletTest{

    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        CompatibilityCalcViewExpected expected = CompatibilityCalcViewExpected.getInstance();
        CompatibilityCalcView actual = CompatibilityCalcView.directNav();
        then(CompatibilityCalcViewCalibrator.getInstance(expected, actual));
    }
}
