package com.tekgs.astro.view.landing;

import com.tekgs.astro.view.landing.signListRegion.SignListRegionExpected;

public class LandingViewExpected implements LandingViewCalibratable {
    
    private LandingViewExpected() {
    }
    
    public static LandingViewExpected getInstance() {
        return new LandingViewExpected();
    }
    
    @Override
    public String getHeading() {
        return "Home";
    }
    
    @Override
    public SignListRegionExpected getSignListRegion() {
        return SignListRegionExpected.getInstance();
    }
}
