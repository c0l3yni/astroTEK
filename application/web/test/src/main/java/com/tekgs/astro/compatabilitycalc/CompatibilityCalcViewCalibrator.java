package com.tekgs.astro.compatabilitycalc;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class CompatibilityCalcViewCalibrator extends Calibrator  {
    private static final String DESCRIPTION = "Compatability Calculator View";
    private final CompatibilityCalcViewExpected expected;
    private final CompatibilityCalcView actual;

    private CompatibilityCalcViewCalibrator(CompatibilityCalcViewExpected expected, CompatibilityCalcView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
    }

    public static CompatibilityCalcViewCalibrator getInstance(CompatibilityCalcViewExpected expected, CompatibilityCalcView actual) {
        return new CompatibilityCalcViewCalibrator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("Compatability Calculator Title", expected.getCompatabilityCalculatorTitle(), actual.getCompatabilityCalculatorTitle());
    }
}
