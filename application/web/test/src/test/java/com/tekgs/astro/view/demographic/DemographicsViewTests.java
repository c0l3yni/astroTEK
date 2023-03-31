package com.tekgs.astro.view.demographic;

import com.tekgs.astro.demographic.DemographicsView;
import com.tekgs.astro.demographic.DemographicsViewCalibrator;
import com.tekgs.astro.demographic.DemographicsViewExpected;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.DEMOGRAPHIC})
public class DemographicsViewTests extends GauntletTest{
    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        DemographicsViewExpected expected = DemographicsViewExpected.getInstance();
        DemographicsView actual = DemographicsView.directNav();
        then(DemographicsViewCalibrator.getInstance(expected, actual));
    }
}
