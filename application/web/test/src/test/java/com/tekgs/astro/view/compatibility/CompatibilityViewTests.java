package com.tekgs.astro.view.compatibility;

import com.tekgs.astro.view.compatability.CompatibilityView;
import com.tekgs.astro.view.compatability.CompatibilityViewCalibrator;
import com.tekgs.astro.view.compatability.CompatibilityViewExpected;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.COMPATIBILITY_CALC})
public class CompatibilityViewTests extends GauntletTest{

    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        CompatibilityViewExpected expected = CompatibilityViewExpected.getInstance();
        CompatibilityView actual = CompatibilityView.directNav();
        then(CompatibilityViewCalibrator.getInstance(expected, actual));
    }
}
