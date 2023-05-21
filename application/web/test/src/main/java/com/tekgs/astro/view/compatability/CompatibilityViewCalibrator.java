package com.tekgs.astro.view.compatability;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class CompatibilityViewCalibrator extends Calibrator {
    private static final String DESCRIPTION = "'Compatibility' view";
    private final CompatibilityViewExpected expected;
    private final MemberLandingView actual;
    
    private CompatibilityViewCalibrator(CompatibilityViewExpected expected, MemberLandingView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
    }
    
    public static CompatibilityViewCalibrator getInstance(CompatibilityViewExpected expected, MemberLandingView actual) {
        return new CompatibilityViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("'Compatibility' heading", expected.getHeading(), actual.getHeading());
    }
}
