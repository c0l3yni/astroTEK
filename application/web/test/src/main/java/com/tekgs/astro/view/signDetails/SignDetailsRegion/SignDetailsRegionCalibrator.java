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
        verify("'Sign Name' text", expected.getSignName(), actual.getSignName());
        verify("'Sign Description' text", expected.getSignDescription(), actual.getSignDescription());
        verify("'Sign Start Date' text", expected.getSignStartDate(), actual.getSignStartDate());
        verify("'Sign End Date' text", expected.getSignEndDate(), actual.getSignEndDate());
        verify("'Sign Tarot Card' text", expected.getSignTarotCard(), actual.getSignTarotCard());
        verify("'Sign Element' text", expected.getSignElement(), actual.getSignElement());
        verify("'Sign Ruling Planet' text", expected.getSignRulingPlanet(), actual.getSignRulingPlanet());
        verify("'Sign Ruling House' text", expected.getSignRulingHouse(), actual.getSignRulingHouse());
        verify("'Sign Color' text", expected.getSignColor(), actual.getSignColor());
        verify("'Sign Sister Sign' text", expected.getSisterSign(), actual.getSisterSign());
        verify("'Sign Modality' text", expected.getSignModality(), actual.getSignModality());
    }
}
