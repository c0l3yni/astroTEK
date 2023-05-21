package com.tekgs.astro.view.compatibility;

import com.tekgs.astro.view.compatability.MemberLandingView;
import com.tekgs.astro.view.compatability.CompatibilityViewCalibrator;
import com.tekgs.astro.view.compatability.CompatibilityViewExpected;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.COMPATIBILITY})
public class CompatibilityViewTests extends GauntletTest {
    
    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        CompatibilityViewExpected expected = CompatibilityViewExpected.getInstance();
        MemberLandingView actual = MemberLandingView.directNav();
        then(CompatibilityViewCalibrator.getInstance(expected, actual));
    }
}