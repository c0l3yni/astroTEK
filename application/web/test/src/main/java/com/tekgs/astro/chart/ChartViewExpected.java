package com.tekgs.astro.chart;

public class ChartViewExpected implements ChartViewCalibratable{
    public static ChartViewExpected getInstance() {
        return new ChartViewExpected();
    }

    @Override
    public String getChartViewTitle() {
        return "Chart";
    }
}
