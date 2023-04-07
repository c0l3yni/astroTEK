package com.tekgs.astro.view.sign;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class SignViewCalibrator extends Calibrator {
    
    private static final String DESCRIPTION = "'Sign' View";
    
    protected SignViewCalibrator(Object expected, Object actual) {
        super(DESCRIPTION, expected, actual);
    }
    
    public static SignViewCalibrator getInstance(SignViewExpected expected, SignView actual) {
        return new SignViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
    
    }
}
