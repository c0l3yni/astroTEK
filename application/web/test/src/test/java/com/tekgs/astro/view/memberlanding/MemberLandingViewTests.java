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

    @Test (groups = {TestSuite.ACCEPTANCE}, dependsOnGroups = "smoke")
    public void directNav() {
        //need to make get is valid in user and definition it returns a boolean but somehow works with this code
        UserDefinition userDefinition = UserDefinition.getInstance().getIsValid();

        MemberLandingView actual = LoginView.directNav(userDefinition).inLoginRegion().clickButton();

        MemberLandingViewExpected expected = MemberLandingViewExpected.getInstance();



        then(MemberLandingViewCalibrator.getInstance(expected, actual));
    }
}
