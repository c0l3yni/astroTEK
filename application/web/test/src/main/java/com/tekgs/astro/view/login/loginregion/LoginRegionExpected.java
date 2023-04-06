package com.tekgs.astro.view.login.loginregion;

import com.tekgs.astro.data.user.User;

public class LoginRegionExpected implements LoginRegionCalibratable{
    private final User loginData;

    public LoginRegionExpected(User loginData) {
        this.loginData = loginData;
    }

    public static LoginRegionExpected getInstance(User loginData) {
        return new LoginRegionExpected(loginData);
    }

    // if the username field exists then the user is not logged in
    // if it is gone and the login button was clicked then they logged in successfully
    // if the username field exists and the you put the wrong credentials message pops up then you had and invalid login
    //same for password but like merge the logic where both have to pass or no login in success msg
//    @Override
//    public boolean isUsernameFieldDisplayed() {
//        return !Objects.equals(getUsernameField(), "");
//    }

    @Override
    public String getUsernameField() {
        return "Username:";
    }

//    @Override
//    public String getSuccessfulLoginMessage() {
//        if (isUsernameFieldDisplayed()) {
//            return "not logged in";
//        } else {
//            return "Hello, user";
//        }
//    }

    @Override
    public String getPasswordField() {
        return "Password:";
    }

    @Override
    public String getSubmitButton() {
        return "Login";
    }
}
