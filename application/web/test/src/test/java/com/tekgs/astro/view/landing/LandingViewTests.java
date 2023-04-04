package com.tekgs.astro.view.landing;

import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.LANDING})
public class LandingViewTests extends GauntletTest {

    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        LandingViewExpected expected = LandingViewExpected.getInstance();
        LandingView actual = LandingView.directNav();
        then(LandingViewCalibrator.getInstance(expected, actual));
    }

}
