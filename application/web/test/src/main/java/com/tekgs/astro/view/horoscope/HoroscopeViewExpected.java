package com.tekgs.astro.view.horoscope;

public class HoroscopeViewExpected implements HoroscopeViewCalibratable{
    public static HoroscopeViewExpected getInstance() {
        return new HoroscopeViewExpected();
    }

    @Override
    public String getHoroscopeViewTitle() {
        return "Horoscope";
    }
}
