package com.tekgs.astro.landing;

public class LandingViewExpected implements LandingViewCalibratable{

    public static LandingViewExpected getInstance() {
        return new LandingViewExpected();
    }

    @Override
    public String getTitle() {
        return "Home";
    }
}
