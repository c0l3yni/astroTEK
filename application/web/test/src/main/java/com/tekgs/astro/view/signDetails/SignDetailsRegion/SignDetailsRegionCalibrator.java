package com.tekgs.astro.view.signDetails.SignDetailsRegion;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class SignDetailsRegionCalibrator extends Calibrator {
    private static final String DESCRIPTION = "'Sign Details' Region";
    private final SignDetailsRegionCalibratable actual;
    private final SignDetailsRegionCalibratable expected;

    private SignDetailsRegionCalibrator(SignDetailsRegionCalibratable expected, SignDetailsRegionCalibratable actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
    }
    public static SignDetailsRegionCalibrator getInstance(SignDetailsRegionCalibratable expected, SignDetailsRegionCalibratable actual) {
        return new SignDetailsRegionCalibrator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("'Sign Name' text", expected.getName(), actual.getName());
        verify("'Sign Description' text", expected.getDescription(), actual.getDescription());
        verify("'Sign Start Date' text", expected.getStartDate(), actual.getStartDate());
        verify("'Sign End Date' text", expected.getEndDate(), actual.getEndDate());
        verify("'Sign Tarot Card' text", expected.getTarotCard(), actual.getTarotCard());
        verify("'Sign Element' text", expected.getSignElement(), actual.getSignElement());
        verify("'Sign Ruling Planet' text", expected.getRulingPlanet(), actual.getRulingPlanet());
        verify("'Sign Ruling House' text", expected.getRulingHouse(), actual.getRulingHouse());
        verify("'Sign Color' text", expected.getColor(), actual.getColor());
        verify("'Sign Sister Sign' text", expected.getSisterSign(), actual.getSisterSign());
        verify("'Sign Modality' text", expected.getModality(), actual.getModality());
    }
}
