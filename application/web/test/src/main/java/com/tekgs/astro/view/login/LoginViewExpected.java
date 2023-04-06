package com.tekgs.astro.view.login;

import com.tekgs.astro.view.login.loginregion.LoginRegionCalibratable;
import com.tekgs.astro.view.login.loginregion.LoginRegionExpected;

public class LoginViewExpected implements LoginViewCalibratable {

    public static LoginViewExpected getInstance() {
        return new LoginViewExpected();
    }
    @Override
    public String getLoginTitle() {
        return "Login";
    }

    @Override
    public LoginRegionCalibratable inLoginRegion() {
        return LoginRegionExpected.getInstance();
    }
}
