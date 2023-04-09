package com.tekgs.astro.view.signDetails;

import com.tekgs.astro.data.sign.Sign;

public class SignDetailsViewExpected implements SignDetailsViewCalibratable {
    
    private final Sign sign;
    
    private SignDetailsViewExpected(Sign sign) {
        this.sign = sign;
    }
    
    public static SignDetailsViewExpected getInstance() {
        return new SignDetailsViewExpected(null);
    }
    
    public static SignDetailsViewExpected getInstance(Sign sign) {
        return new SignDetailsViewExpected(sign);
    }
    
    @Override
    public String getSignViewTitle() {
        return "Sign";
    }
    
    @Override
    public String getSignName() {
        return this.sign.getName();
    }
    
    @Override
    public String getSignDescription() {
        return this.sign.getDescription();
    }
}
