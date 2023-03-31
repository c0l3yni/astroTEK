package com.tekgs.astro.demographic;

public class DemographicViewExpected implements DemographicViewCalibratable{

    public static DemographicViewExpected getInstance() {
        return new DemographicViewExpected();
    }
    @Override
    public String getInputFormTitle() {
        return "Demographics Form";
    }
}
