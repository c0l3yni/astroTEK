package com.tekgs.astro.view.landing.signListRegion.signRegion;

import com.tekgs.astro.data.sign.Sign;

public class SignRegionExpected implements SignRegionCalibratable{
    private final Sign sign;
    
    public SignRegionExpected(Sign sign) {
        this.sign = sign;
    }
    
    public static SignRegionExpected getInstance(Sign sign) {
        return new SignRegionExpected(sign);
    }
    
    @Override
    public String getSignName() {
        return this.sign.getName();
    }
}
