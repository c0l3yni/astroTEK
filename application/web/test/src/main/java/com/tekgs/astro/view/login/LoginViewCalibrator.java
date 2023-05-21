package com.tekgs.astro.view.login;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class LoginViewCalibrator extends Calibrator {
    public static final String DESCRIPTION = "'Login' view";
    public final LoginViewExpected expected;
    public final LoginView actual;
    
    private LoginViewCalibrator(LoginViewExpected expected, LoginView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
    }
    
    public static LoginViewCalibrator getInstance(LoginViewExpected expected, LoginView actual) {
        return new LoginViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("'Login' heading", this.expected.getHeading(), this.actual.getHeading());
    }
}
