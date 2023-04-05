package com.tekgs.astro.view.login;

import com.tekgs.astro.view.landing.LandingView;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.LOGIN})
public class LoginViewTests extends GauntletTest {

    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        LoginViewExpected expected = LoginViewExpected.getInstance();
        LoginView actual = LoginView.directNav();
        then(LoginViewCalibrator.getInstance(expected, actual));
    }
    
    @Test(groups = {TestSuite.ACCEPTANCE, TestSuite.DEBUG}, dependsOnMethods = "smoke")
    public void fromLandingView() {
        LoginViewExpected expected = LoginViewExpected.getInstance();
        LoginView actual = LandingView.directNav().toLoginView();
        then(LoginViewCalibrator.getInstance(expected, actual));
    }
}
