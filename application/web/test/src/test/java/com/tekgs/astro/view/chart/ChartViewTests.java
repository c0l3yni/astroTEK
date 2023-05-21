package com.tekgs.astro.view.chart;

import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.CHART})
public class ChartViewTests extends GauntletTest {
    
    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        ChartViewExpected expected = ChartViewExpected.getInstance();
        ChartView actual = ChartView.directNav();
        then(ChartViewCalibrator.getInstance(expected, actual));
    }
    
    
}
