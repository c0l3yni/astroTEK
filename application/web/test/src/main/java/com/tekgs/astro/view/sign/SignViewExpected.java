package com.tekgs.astro.view.sign;

public class SignViewExpected implements SignViewCalibratable {
    
    private SignViewExpected() {
    }
    
    public static SignViewExpected getInstance() {
        return new SignViewExpected();
    }
    
    @Override
    public String getSignViewTitle() {
        return "Sign";
    }
}
