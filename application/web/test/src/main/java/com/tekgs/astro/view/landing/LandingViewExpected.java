package com.tekgs.astro.view.landing;

public class LandingViewExpected implements LandingViewCalibratable{
    
    private LandingViewExpected() {
    }
    
    public static LandingViewExpected getInstance() {
        return new LandingViewExpected();
    }

    @Override
    public String getTitle() {
        return "Home";
    }
}
