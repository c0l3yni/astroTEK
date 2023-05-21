package com.tekgs.astro.view.landing.signListRegion.signRegion;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class SignRegionCalibrator extends Calibrator {
    private static final String DESCRIPTION = "'Sign' region";
    private final SignRegionExpected expected;
    private final SignRegion actual;
    
    
    private SignRegionCalibrator(SignRegionExpected expected, SignRegion actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
    }
    
    public static SignRegionCalibrator getInstance(SignRegionExpected expected, SignRegion actual) {
        return new SignRegionCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("'Sign' name", this.expected.getSignName(), this.actual.getSignName());
    }
}
