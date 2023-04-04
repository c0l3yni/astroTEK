package com.tekgs.astro.view.compatability;

public class CompatibilityViewExpected implements CompatibilityViewCalibratable {
    public static CompatibilityViewExpected getInstance() {
        return new CompatibilityViewExpected();
    }

    @Override
    public String getCompatabilityCalculatorTitle() {
        return "Compatability";
    }
}
