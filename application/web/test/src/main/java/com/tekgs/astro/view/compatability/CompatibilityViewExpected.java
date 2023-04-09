package com.tekgs.astro.view.compatability;

public class CompatibilityViewExpected implements CompatibilityViewCalibratable {
    
    private CompatibilityViewExpected() {
    }
    
    public static CompatibilityViewExpected getInstance() {
        return new CompatibilityViewExpected();
    }
    
    @Override
    public String getCompatibilityCalculatorTitle() {
        return "Compatibility";
    }
}
