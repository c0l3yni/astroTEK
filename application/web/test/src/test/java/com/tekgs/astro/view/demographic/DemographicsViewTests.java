package com.tekgs.astro.view.demographic;

import com.tekgs.astro.view.landing.LandingView;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.DEMOGRAPHICS})
public class DemographicsViewTests extends GauntletTest {
    
    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        DemographicsViewExpected expected = DemographicsViewExpected.getInstance();
        DemographicsView actual = DemographicsView.directNav();
        then(DemographicsViewCalibrator.getInstance(expected, actual));
    }
    
    @Test(groups = {TestSuite.ACCEPTANCE}, dependsOnMethods = "smoke")
    public void fromLandingView() {
        DemographicsViewExpected expected = DemographicsViewExpected.getInstance();
        DemographicsView actual = LandingView.directNav().toDemographicsView();
        then(DemographicsViewCalibrator.getInstance(expected, actual));
    }
}
