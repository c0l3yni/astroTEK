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
    @DataProvider
    public static Object[][] scenarios() {
        return new Object[][]{
                {UserDefinition.getInstance().withUsername("user123").withPassword("pass123")}
                , {UserDefinition.getInstance().withUsername("nonuser").withPassword("invalid")}
        };
    }
    @Test(groups = {TestSuite.SMOKE, TestSuite.DEBUG})
    public void smoke() {
        LoginViewExpected expected = LoginViewExpected.getInstance();
        LoginView actual = LoginView.directNav();
        then(LoginViewCalibrator.getInstance(expected, actual));
    }

    @Test(groups = {TestSuite.DEBUG},dependsOnMethods = "smoke", dataProvider = "scenarios")
    public void directNav(UserDefinition userDefinition) {
        User loginData = UserProvider.getInstance().get(userDefinition);
        LoginViewExpected expected = LoginViewExpected.getInstance(loginData);
        LoginView actual = LoginView.directNav(loginData);
        then(LoginViewCalibrator.getInstance(expected, actual));
    }
}
