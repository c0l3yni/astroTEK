package com.tekgs.astro.view.login;

import com.tekgs.astro.data.user.User;
import com.tekgs.astro.view.login.loginregion.LoginRegionCalibratable;
import com.tekgs.astro.view.login.loginregion.LoginRegionExpected;

public class LoginViewExpected implements LoginViewCalibratable {
    private final User loginData;

    public LoginViewExpected(User loginData) {
        this.loginData = loginData;
    }

    public static LoginViewExpected getInstance(User loginDate) {
        return new LoginViewExpected(loginDate);
    }
    public static LoginViewExpected getInstance() {
        return new LoginViewExpected(null);
    }
    @Override
    public String getLoginTitle() {
        return "Login";
    }

    @Override
    public LoginRegionCalibratable inLoginRegion() {
        return LoginRegionExpected.getInstance(loginData);
    }
}
