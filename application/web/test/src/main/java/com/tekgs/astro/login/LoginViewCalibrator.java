package com.tekgs.astro.login;

import com.softwareonpurpose.calibrator4test.Calibrator;
import com.tekgs.astro.login.loginregion.LoginRegionCalibrator;

public class LoginViewCalibrator extends Calibrator {

    public static final String DESCRIPTION = "'Login' View";
    public final LoginViewExpected expected;
    public final LoginView actual;

    private LoginViewCalibrator(LoginViewExpected expected, LoginView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
        addChildCalibrator(LoginRegionCalibrator.getInstance(expected.inLoginRegion(), actual.inLoginRegion()));
    }

    public static LoginViewCalibrator getInstance(LoginViewExpected expected, LoginView actual) {
        return new LoginViewCalibrator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("'Login View' title", expected.getLoginTitle(), actual.getLoginTitle());
    }
}
