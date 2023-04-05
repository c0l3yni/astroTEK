package com.tekgs.astro.login.loginregion;

public class LoginRegionExpected implements LoginRegionCalibratable{
    public static LoginRegionExpected getInstance() {
        return new LoginRegionExpected();
    }

    @Override
    public String getUsernameField() {
        return "Username:";
    }

    @Override
    public String getPasswordField() {
        return "Password:";
    }

    @Override
    public String getSubmitButton() {
        return "Login";
    }
}
