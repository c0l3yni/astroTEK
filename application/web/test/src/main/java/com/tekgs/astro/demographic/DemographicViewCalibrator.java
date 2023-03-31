package com.tekgs.astro.demographic;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class DemographicViewCalibrator extends Calibrator {
    private static final String DESCRIPTION = "'Demographic Information Input' View";
    private final DemographicView actual;
    private final DemographicViewExpected expected;

    private DemographicViewCalibrator(DemographicViewExpected expected, DemographicView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
    }

    public static DemographicViewCalibrator getInstance(DemographicViewExpected expected, DemographicView actual) {
        return new DemographicViewCalibrator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("'Demographic' Input Form", expected.getInputFormTitle(), actual.getInputFormTitle());
    }
}
