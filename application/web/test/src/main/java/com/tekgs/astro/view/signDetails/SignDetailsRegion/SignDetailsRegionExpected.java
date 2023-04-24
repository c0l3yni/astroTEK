package com.tekgs.astro.view.signDetails.SignDetailsRegion;

import com.tekgs.astro.data.sign.Sign;

public class SignDetailsRegionExpected implements SignDetailsRegionCalibratable{
    private final Sign sign;
    public SignDetailsRegionExpected(Sign sign) {
        this.sign = sign;
    }

    public static SignDetailsRegionExpected getInstance(Sign sign) {
        return new SignDetailsRegionExpected(sign);
    }

    @Override
    public String getName() {
        return sign.getName();
    }

    @Override
    public String getDescription() {
        return sign.getDescription();
    }

    @Override
    public String getStartDate() {
        return sign.getStartDate();
    }

    @Override
    public String getEndDate() {
        return sign.getEndDate();
    }

    @Override
    public String getTarotCard() {
        return sign.getTarotCard();
    }

    @Override
    public String getSignElement() {
        return sign.getSignElement();
    }

    @Override
    public String getRulingPlanet() {
        return sign.getRulingPlanet();
    }

    @Override
    public String getRulingHouse() {
        return sign.getRulingHouse();
    }

    @Override
    public String getColor() {
        return sign.getRulingHouse();
    }

    @Override
    public String getSisterSign() {
        return sign.getSisterSign();
    }

    @Override
    public String getModality() {
        return sign.getModality();
    }
}
