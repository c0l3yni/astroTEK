package com.tekgs.astro.view.login.loginregion;

import com.tekgs.astro.data.user.UserCalibratable;
import com.tekgs.astro.data.user.UserDefinition;

public class LoginRegionExpected implements LoginRegionCalibratable{
    private final UserCalibratable user;
    private final Boolean isFailed;

    public LoginRegionExpected(UserCalibratable user, Boolean isFailed) {
        this.user = user;
        this.isFailed = isFailed;
    }

    public static LoginRegionExpected getInstance(UserCalibratable user, Boolean isFailed) {
        return new LoginRegionExpected(user, isFailed);
    }

    @Override
    public String getUsernameField() {
        return user == null ? "" : user.getUsername();
    }

    @Override
    public String getBadLoginMessage() {
        return isFailed ? "Incorrect credentials provided" : "";
    }

    @Override
    public String getPasswordField() {
        return user == null ? "" : user.getPassword();
    }

    @Override
    public String getSubmitButton() {
        return "Login";
    }
}
