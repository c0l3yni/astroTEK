package com.tekgs.astro.view.signDetails.SignDetailsRegion;

import com.tekgs.astro.data.sign.Sign;

public class SignDetailsRegionExpected implements SignDetailsRegionCalibratable {
    private final Sign sign;
    
    public SignDetailsRegionExpected(Sign sign) {
        this.sign = sign;
    }
    
    public static SignDetailsRegionExpected getInstance(Sign sign) {
        return new SignDetailsRegionExpected(sign);
    }
    
    @Override
    public String getSignName() {
        return this.sign == null ? null : this.sign.getName();
    }
    
    @Override
    public String getSignDescription() {
        return this.sign == null ? null : this.sign.getDescription();
    }
    
    @Override
    public String getSignStartDate() {
        return this.sign == null ? null : this.sign.getStartDate();
    }
    
    @Override
    public String getSignEndDate() {
        return this.sign == null ? null : this.sign.getEndDate();
    }
    
    @Override
    public String getSignTarotCard() {
        return this.sign == null ? null : this.sign.getTarotCard();
    }
    
    @Override
    public String getSignElement() {
        return this.sign == null ? null : this.sign.getSignElement();
    }
    
    @Override
    public String getSignRulingPlanet() {
        return this.sign == null ? null : this.sign.getRulingPlanet();
    }
    
    @Override
    public String getSignRulingHouse() {
        return this.sign == null ? null : this.sign.getRulingHouse();
    }
    
    @Override
    public String getSignColor() {
        return this.sign == null ? null : this.sign.getColor();
    }
    
    @Override
    public String getSisterSign() {
        return this.sign == null ? null : this.sign.getSisterSign();
    }
    
    @Override
    public String getSignModality() {
        return this.sign == null ? null : this.sign.getModality();
    }
}
