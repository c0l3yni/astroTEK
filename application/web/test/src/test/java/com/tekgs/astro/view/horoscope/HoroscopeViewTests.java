package com.tekgs.astro.view.horoscope;

import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.HOROSCOPE})
public class HoroscopeViewTests extends GauntletTest {
    
    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        HoroscopeViewExpected expected = HoroscopeViewExpected.getInstance();
        HoroscopeView actual = HoroscopeView.directNav();
        then(HoroscopeViewCalibrator.getInstance(expected, actual));
    }
}
