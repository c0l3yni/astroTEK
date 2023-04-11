package com.tekgs.astro.view.login;

import com.tekgs.astro.data.user.User;
import com.tekgs.astro.data.user.UserCalibratable;
import com.tekgs.astro.view.login.loginregion.LoginRegionCalibratable;
import com.tekgs.astro.view.login.loginregion.LoginRegionExpected;

public class LoginViewExpected implements LoginViewCalibratable {
    private final UserCalibratable loginData;
    private final Boolean isFailed;

    public LoginViewExpected(UserCalibratable loginData, Boolean isFailed) {
        this.loginData = loginData;
        this.isFailed = isFailed;
    }

    public static LoginViewExpected getInstance(UserCalibratable loginDate) {
        return new LoginViewExpected(loginDate, null);
    }
    public static LoginViewExpected getInstance() {
        return new LoginViewExpected(null,null);
    }

    public static LoginViewExpected getFailedInstance(UserCalibratable loginData) {
        return new LoginViewExpected(loginData, true);
    }

    @Override
    public String getLoginTitle() {
        return "Login";
    }

    @Override
    public LoginRegionCalibratable inLoginRegion() {
        return LoginRegionExpected.getInstance(loginData, isFailed);
    }
}
