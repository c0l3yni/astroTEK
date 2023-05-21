package com.tekgs.astro.view.login;

public class LoginViewExpected implements LoginViewCalibratable {
    
    public static LoginViewExpected getInstance() {
        return new LoginViewExpected();
    }
    
    @Override
    public String getHeading() {
        return "Login";
    }
}
