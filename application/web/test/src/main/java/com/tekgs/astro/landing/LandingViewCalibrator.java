package com.tekgs.astro.landing;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class LandingViewCalibrator extends Calibrator{
    private static final String DESCRIPTION = "'Landing' View";
    private final LandingView actual;
    private final LandingViewExpected expected;

    protected LandingViewCalibrator(LandingViewExpected expected, LandingView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
    }

    public static LandingViewCalibrator getInstance(LandingViewExpected expected, LandingView actual) {
        return new LandingViewCalibrator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
            verify("Landing", expected.getTitle(), actual.getTitle());
    }
}
