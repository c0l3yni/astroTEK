package com.tekgs.astro.view.compatability;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class CompatibilityViewCalibrator extends Calibrator {
    private static final String DESCRIPTION = "Compatibility Calculator View";
    private final CompatibilityViewExpected expected;
    private final CompatibilityView actual;
    
    private CompatibilityViewCalibrator(CompatibilityViewExpected expected, CompatibilityView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
    }
    
    public static CompatibilityViewCalibrator getInstance(CompatibilityViewExpected expected, CompatibilityView actual) {
        return new CompatibilityViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("Compatibility Calculator Title", expected.getCompatibilityCalculatorTitle(), actual.getCompatibilityCalculatorTitle());
    }
}
