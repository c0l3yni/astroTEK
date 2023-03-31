package com.tekgs.astro.view.chart;

import com.tekgs.astro.chart.ChartView;
import com.tekgs.astro.chart.ChartViewCalibrator;
import com.tekgs.astro.chart.ChartViewExpected;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.CHART})
public class ChartViewTests extends GauntletTest {

    @Test(groups = {TestSuite.SMOKE, TestSuite.DEBUG})
    public void smoke() {
        ChartViewExpected expected = ChartViewExpected.getInstance();
        ChartView actual = ChartView.directNav();
        then(ChartViewCalibrator.getInstance(expected, actual));
    }
}
