package com.tekgs.astro.view.login;

import com.tekgs.astro.data.user.User;
import com.tekgs.astro.data.user.UserDefinition;
import com.tekgs.astro.data.user.UserProvider;
import com.tekgs.astro.view.login.loginregion.LoginRegion;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.LOGIN})
public class LoginViewTests extends GauntletTest {
    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        LoginViewExpected expected = LoginViewExpected.getInstance();
        LoginView actual = LoginView.directNav();
        then(LoginViewCalibrator.getInstance(expected, actual));
    }

    @Test(groups = {TestSuite.ACCEPTANCE},dependsOnMethods = "smoke")
    public void failed() {
        UserDefinition userDefinition = UserDefinition.getInstance().withUsername("nonuser").withPassword("invalid");
        LoginViewExpected expected = LoginViewExpected.getFailedInstance(userDefinition);
        LoginView actual = LoginView.directNav().inLoginRegion().login_fail(userDefinition);
        then(LoginViewCalibrator.getInstance(expected, actual));
    }
}
