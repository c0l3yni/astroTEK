package com.tekgs.astro.view.login;

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
}
