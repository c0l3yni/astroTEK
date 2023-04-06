package com.tekgs.astro.view.horoscope;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class HoroscopeViewCalibrator extends Calibrator {
    private static final String DESCRIPTION = "Horoscope View";
    private final HoroscopeViewExpected expected;
    private final HoroscopeView actual;

    private HoroscopeViewCalibrator(HoroscopeViewExpected expected, HoroscopeView actual) {
        super(DESCRIPTION, expected, actual);
        this.actual =actual;
        this.expected = expected;
    }

    public static HoroscopeViewCalibrator getInstance(HoroscopeViewExpected expected, HoroscopeView actual) {
        return new HoroscopeViewCalibrator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("Horoscope View title", expected.getHoroscopeViewTitle(), actual.getHoroscopeViewTitle());
    }
}
