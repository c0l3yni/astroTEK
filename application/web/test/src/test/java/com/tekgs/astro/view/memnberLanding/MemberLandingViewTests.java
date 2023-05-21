package com.tekgs.astro.view.memnberLanding;

import com.tekgs.astro.data.user.User;
import com.tekgs.astro.data.user.UserProvider;
import com.tekgs.astro.view.login.LoginView;
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
    
    @Test(groups = {TestSuite.SMOKE, TestSuite.DEBUG})
    public void fromLoginView() {
        User user = UserProvider.getInstance().get();
        MemberLandingViewExpected expected = MemberLandingViewExpected.getInstance();
        MemberLandingView actual = LoginView.directNav().submitLogin(user);
        then(MemberLandingViewCalibrator.getInstance(expected, actual));
    }
}