package com.tekgs.astro.view.memberlanding;
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
        MemberLandingViewExpected expected = MemberLandingViewExpected.getInstance();
        MemberLandingView actual = LoginView.directNav().inLoginRegion().clickButton();
        then(MemberLandingViewCalibrator.getInstance(expected, actual));
    }
}
