package com.tekgs.astro.data.user.product;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class UserCalibrator extends Calibrator {

    private static final String DESCRIPTION = "'Product'";
    private final UserCalibratable expected;
    private final UserCalibratable actual;

    public UserCalibrator(UserCalibratable expected, UserCalibratable actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
    }

    public static Calibrator getInstance(UserCalibratable expected, UserCalibratable actual) {
        return new UserCalibrator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("'User' username ", this.expected.getUsername(), this.actual.getUsername());
        verify("'User' password ", this.expected.getPassword(), this.actual.getPassword());

    }
}
