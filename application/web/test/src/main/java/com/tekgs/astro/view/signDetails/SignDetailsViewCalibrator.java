package com.tekgs.astro.view.signDetails;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class SignDetailsViewCalibrator extends Calibrator {
    
    private static final String DESCRIPTION = "'Sign' View";
    private final SignDetailsViewExpected expected;
    private final SignDetailsView actual;
    
    protected SignDetailsViewCalibrator(SignDetailsViewExpected expected, SignDetailsView actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
    }
    
    public static SignDetailsViewCalibrator getInstance(SignDetailsViewExpected expected, SignDetailsView actual) {
        return new SignDetailsViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("'Sign Details' view title", expected.getSignViewTitle(), actual.getSignViewTitle());
        verify("'Sign Name' text", expected.getSignName(), actual.getSignName());
        verify("'Sign Name' text", expected.getSignDescription(), actual.getSignDescription());
    }
}
