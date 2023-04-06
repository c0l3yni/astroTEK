package com.tekgs.astro.view.login;

import com.tekgs.astro.view.login.loginregion.LoginRegionCalibratable;

public interface LoginViewCalibratable {
    String getLoginTitle();

    LoginRegionCalibratable inLoginRegion();
}
