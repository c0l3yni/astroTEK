package com.tekgs.astro.horoscope;

public class HoroscopeViewExpected implements HoroscopeViewCalibratable{
    public static HoroscopeViewExpected getInstance() {
        return new HoroscopeViewExpected();
    }

    @Override
    public String getHoroscopeViewTitle() {
        return "Horoscope";
    }
}
