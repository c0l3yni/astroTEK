package com.tekgs.astro.view.landing;

import com.softwareonpurpose.calibrator4test.Calibrator;
import com.tekgs.astro.view.landing.signListRegion.SignListRegionCalibrator;

public class LandingViewCalibrator extends Calibrator {
    private static final String DESCRIPTION = "'Landing' view";
    private final LandingView actual;
    private final LandingViewExpected expected;
    
    private LandingViewCalibrator(LandingViewExpected expected, LandingView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
        addChildCalibrator(SignListRegionCalibrator.getInstance(expected.getSignListRegion(), actual.getSignListRegion()));
    }
    
    public static LandingViewCalibrator getInstance(LandingViewExpected expected, LandingView actual) {
        return new LandingViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("'Landing' heading", this.expected.getHeading(), this.actual.getHeading());
    }
}
