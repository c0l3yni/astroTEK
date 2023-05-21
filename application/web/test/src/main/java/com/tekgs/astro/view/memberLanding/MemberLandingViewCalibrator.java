package com.tekgs.astro.view.memberLanding;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class MemberLandingViewCalibrator extends Calibrator {
    
    private static final String DESCRIPTION = "'Member Landing' view";
    
    protected MemberLandingViewCalibrator(MemberLandingViewExpected expected, MemberLandingView actual) {
        super(DESCRIPTION, expected, actual);
    }
    
    public static MemberLandingViewCalibrator getInstance(MemberLandingViewExpected expected, MemberLandingView actual) {
        return new MemberLandingViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
    
    }
}
