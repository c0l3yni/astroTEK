package com.tekgs.astro.login;

import com.tekgs.astro.login.loginregion.LoginRegionCalibratable;

public interface LoginViewCalibratable {
    String getLoginTitle();

    LoginRegionCalibratable inLoginRegion();
}
