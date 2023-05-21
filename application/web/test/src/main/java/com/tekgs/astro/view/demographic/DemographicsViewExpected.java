package com.tekgs.astro.view.demographic;

public class DemographicsViewExpected implements DemographicsViewCalibratable {
    
    public static DemographicsViewExpected getInstance() {
        return new DemographicsViewExpected();
    }
    
    @Override
    public String getHeading() {
        return "Demographics";
    }
}
