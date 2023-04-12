package com.tekgs.astro.view.memberlanding;

import com.tekgs.astro.data.user.UserDefinition;
import com.tekgs.astro.view.login.LoginView;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.MEMBERLANDING})
public class MemberLandingViewTests extends GauntletTest {

    @Test (groups = {TestSuite.SMOKE})
    public void smoke() {
        MemberLandingViewExpected expected = MemberLandingViewExpected.getInstance();
        MemberLandingView actual = MemberLandingView.directNav();
        then(MemberLandingViewCalibrator.getInstance(expected, actual));
    }

    @Test (groups = {TestSuite.ACCEPTANCE, TestSuite.DEBUG}, dependsOnGroups = "smoke")
    public void directNav() {
        UserDefinition userDefinition = UserDefinition.getInstance().withUsername("user123").withPassword("pass123");
        MemberLandingViewExpected expected = MemberLandingViewExpected.getInstance();
        MemberLandingView actual = LoginView.directNav().inLoginRegion().login(userDefinition);
        then(MemberLandingViewCalibrator.getInstance(expected, actual));
    }
}
