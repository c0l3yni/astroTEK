package com.tekgs.astro.view.memberlanding;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class MemberLandingViewCalibrator extends Calibrator {
    private static final String DESCRIPTION = "'Member Landing' View";
    private final MemberLandingViewExpected expected;
    private final MemberLandingView actual;

    private MemberLandingViewCalibrator(MemberLandingViewExpected expected, MemberLandingView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
    }

    public static MemberLandingViewCalibrator getInstance(MemberLandingViewExpected expected, MemberLandingView actual) {
        return new MemberLandingViewCalibrator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("Member Landing View Title", expected.getTitle(), actual.getTitle());
    }
}
