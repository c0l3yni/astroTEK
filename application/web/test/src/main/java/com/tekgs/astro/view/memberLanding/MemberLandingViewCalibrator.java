package com.tekgs.astro.view.memberLanding;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class MemberLandingViewCalibrator extends Calibrator {
    
    private static final String DESCRIPTION = "'Member Landing' view";
    private final MemberLandingViewExpected expected;
    private final MemberLandingView actual;
    
    protected MemberLandingViewCalibrator(MemberLandingViewExpected expected, MemberLandingView actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
    }
    
    public static MemberLandingViewCalibrator getInstance(MemberLandingViewExpected expected, MemberLandingView actual) {
        return new MemberLandingViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("'Member Landing' heading", this.expected.getHeading(), this.actual.getHeading());
        verify("'Welcome' message", this.expected.getWelcomeMessage(), this.actual.getWelcomeMessage());
    }
}
