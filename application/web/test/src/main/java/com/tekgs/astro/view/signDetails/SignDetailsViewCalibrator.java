package com.tekgs.astro.view.signDetails;

import com.softwareonpurpose.calibrator4test.Calibrator;
import com.tekgs.astro.view.signDetails.SignDetailsRegion.SignDetailsRegionCalibrator;

public class SignDetailsViewCalibrator extends Calibrator {
    
    private static final String DESCRIPTION = "'Sign Details' view";
    private final SignDetailsViewExpected expected;
    private final SignDetailsView actual;
    
    protected SignDetailsViewCalibrator(SignDetailsViewExpected expected, SignDetailsView actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
        addChildCalibrator(SignDetailsRegionCalibrator.getInstance(expected.inSignDetailsRegion(), actual.inSignDetailsRegion()));
    }
    
    public static SignDetailsViewCalibrator getInstance(SignDetailsViewExpected expected, SignDetailsView actual) {
        return new SignDetailsViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("'Sign Details' heading", expected.getHeading(), actual.getHeading());
    }
}
