package com.tekgs.astro.data.sign;

public interface SignCalibratable {
    String getName();
    
    String getDescription();
    
    String getId();
    
    String getStartDate();
    
    String getEndDate();
    
    String getTarotCard();
    
    String getSignElement();
    
    String getRulingPlanet();
    
    String getRulingHouse();
    
    String getColor();
    
    String getSisterSign();
    
    String getModality();
    
    boolean equivalent(SignCalibratable comparator);
}
