package com.tekgs.astro.view.horoscope;

import com.tekgs.astro.horoscope.HoroscopeView;
import com.tekgs.astro.horoscope.HoroscopeViewCalibrator;
import com.tekgs.astro.horoscope.HoroscopeViewExpected;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test (groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.HOROSCOPE})
public class HoroscopeViewTests extends GauntletTest {

    @Test(groups = {TestSuite.SMOKE, TestSuite.DEBUG})
    public void smoke() {
        HoroscopeViewExpected expected = HoroscopeViewExpected.getInstance();
        HoroscopeView actual = HoroscopeView.directNav();
        then(HoroscopeViewCalibrator.getInstance(expected, actual));
    }
}
