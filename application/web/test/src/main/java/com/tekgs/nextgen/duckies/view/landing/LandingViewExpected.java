package com.tekgs.nextgen.duckies.view.landing;

public class LandingViewExpected implements LandingViewCalibratable{
    public static LandingViewExpected getInstance() {
        return new LandingViewExpected();
    }

    @Override
    public String getLandingMessage() {
        return "Welcome, Here is your SIGN to read the STARS!";
    }
}
