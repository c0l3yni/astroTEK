package com.tekgs.astro.view.chart;

import com.softwareonpurpose.calibrator4test.Calibrator;

public class ChartViewCalibrator extends Calibrator {
    private static final String DESCRIPTION = "Chart View";
    private final ChartView actual;
    private final ChartViewExpected expected;
    
    private ChartViewCalibrator(ChartViewExpected expected, ChartView actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
    }
    
    public static ChartViewCalibrator getInstance(ChartViewExpected expected, ChartView actual) {
        return new ChartViewCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        verify("Chart View Title", expected.getChartViewTitle(), actual.getChartViewTitle());
    }
}
