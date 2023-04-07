package com.tekgs.astro.view.signDetails;

import com.tekgs.astro.data.sign.Sign;

public class SignViewExpected implements SignViewCalibratable {
    
    private final Sign sign;
    
    private SignViewExpected(Sign sign) {
        this.sign = sign;
    }
    
    public static SignViewExpected getInstance() {
        return new SignViewExpected(null);
    }
    
    public static SignViewExpected getInstance(Sign sign) {
        return new SignViewExpected(sign);
    }
    
    @Override
    public String getSignViewTitle() {
        return "Sign";
    }
}
