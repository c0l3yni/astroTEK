package com.tekgs.astro.view.login.loginregion;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class LoginRegionCalibrator extends Calibrator {
    private static final String DESCRIPTION = "'Login' Region";
    private final LoginRegionCalibratable actual;
    private final LoginRegionCalibratable expected;

    public LoginRegionCalibrator(LoginRegionCalibratable expected, LoginRegionCalibratable actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
    }
    public static LoginRegionCalibrator getInstance(LoginRegionCalibratable expected, LoginRegionCalibratable actual) {
        return new LoginRegionCalibrator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("username field", expected.getUsernameField(), actual.getUsernameField());
        verify("password field", expected.getPasswordField(), actual.getPasswordField());
        verify("submit button", expected.getSubmitButton(), actual.getSubmitButton());
        verify("bad login", expected.getBadLoginMessage(), actual.getBadLoginMessage());
    }
}
