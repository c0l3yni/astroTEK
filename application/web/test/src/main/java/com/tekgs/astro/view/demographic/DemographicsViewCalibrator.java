package com.tekgs.astro.view.demographic;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class DemographicsViewCalibrator extends Calibrator {
    private static final String DESCRIPTION = "'Demographic Information Input' View";
    private final DemographicsView actual;
    private final DemographicsViewExpected expected;
    
    private DemographicsViewCalibrator(DemographicsViewExpected expected, DemographicsView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual = actual;
        this.expected = expected;
    }
    
    public static DemographicsViewCalibrator getInstance(DemographicsViewExpected expected, DemographicsView actual) {
        return new DemographicsViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("'Demographic' Input Form", expected.getInputFormTitle(), actual.getInputFormTitle());
    }
}
