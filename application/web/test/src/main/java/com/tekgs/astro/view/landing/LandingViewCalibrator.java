package com.tekgs.astro.view.landing;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class LandingViewCalibrator extends Calibrator{
    private static final String DESCRIPTION = "'Landing' View";
    private final LandingView actual;
    private final LandingViewExpected expected;

    private LandingViewCalibrator(LandingViewExpected expected, LandingView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
    }

    public static LandingViewCalibrator getInstance(LandingViewExpected expected, LandingView actual) {
        return new LandingViewCalibrator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
            verify("Landing View message", expected.getTitle(), actual.getTitle());
    }
}
