package com.tekgs.astro.view.signDetails;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class SignViewCalibrator extends Calibrator {
    
    private static final String DESCRIPTION = "'Sign' View";
    private final SignViewExpected expected;
    private final SignView actual;
    
    protected SignViewCalibrator(SignViewExpected expected, SignView actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
    }
    
    public static SignViewCalibrator getInstance(SignViewExpected expected, SignView actual) {
        return new SignViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("'Sign' view title", expected.getSignViewTitle(), actual.getSignViewTitle());
    }
}
