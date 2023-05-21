package com.tekgs.astro.view;

import com.tekgs.astro.view.memberLanding.MemberLandingView;
import com.tekgs.astro.view.memberLanding.MemberLandingViewCalibrator;
import com.tekgs.astro.view.memberLanding.MemberLandingViewExpected;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.MEMBER_LANDING})
public class MemberLandingViewTests extends GauntletTest {
    
    @Test(groups = {TestSuite.SMOKE, TestSuite.DEBUG})
    public void smoke() {
        MemberLandingViewExpected expected = MemberLandingViewExpected.getInstance();
        MemberLandingView actual = MemberLandingView.directNav();
        then(MemberLandingViewCalibrator.getInstance(expected, actual));
    }
}
