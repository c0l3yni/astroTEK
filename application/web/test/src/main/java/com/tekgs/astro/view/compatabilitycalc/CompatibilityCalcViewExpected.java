package com.tekgs.astro.view.compatabilitycalc;

public class CompatibilityCalcViewExpected implements CompatibilityCalcViewCalibratable{
    public static CompatibilityCalcViewExpected getInstance() {
        return new CompatibilityCalcViewExpected();
    }

    @Override
    public String getCompatabilityCalculatorTitle() {
        return "Compatability";
    }
}
