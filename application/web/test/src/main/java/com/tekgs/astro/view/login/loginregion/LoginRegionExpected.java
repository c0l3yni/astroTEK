package com.tekgs.astro.view.login.loginregion;

import com.tekgs.astro.data.user.User;
import com.tekgs.astro.data.user.UserCalibratable;
import com.tekgs.astro.data.user.UserDefinition;

import java.util.Objects;

public class LoginRegionExpected implements LoginRegionCalibratable{
    private final User loginData; // my real psw and usrnm

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

    // expect an incorrect login message if things were incorrect
    public boolean isLoginSuccessful() {
        UserCalibratable badTestData = UserDefinition.getInstance().withUsername("nonuser").withPassword("invalid");
        if(this.loginData != null) {
        if (loginData.getUsername().equals(badTestData.getUsername()) && loginData.getPassword().equals(badTestData.getPassword())) {
          return true;
        }}
        return false;
    }

    @Override
    public String getUsernameField() {
        return "Username:";
    }

    @Override
    public String getBadLoginMessage() {
        if (isLoginSuccessful() || loginData == null) {
            return "";
        } else {
            return "Incorrect credentials provided";
        }
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
