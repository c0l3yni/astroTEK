package com.tekgs.nextgen.duckies.view.landing;

import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.HOME_PAGE})
public class LandingViewTests extends GauntletTest {

    @Test(groups = {TestSuite.SMOKE, TestSuite.DEBUG})
    public void smoke() {
        LandingViewExpected expected = LandingViewExpected.getInstance();
        LandingView actual = LandingView.directNav();
        then(LandingViewCalibrator.getInstance(expected, actual));
    }

}
