package com.tekgs.astro.data.sign;

@SuppressWarnings("unused") //  Gson is used to populate the fields
public class SignDefinition implements SignCalibratable {
    private String id;
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private String tarotCard;
    private String element;
    private String rulingPlanet;
    private String rulingHouse;
    private String color;
    private String sisterSign;
    private String modality;
    
    public static SignDefinition getInstance() {
        return new SignDefinition();
    }
    
    public SignDefinition withId(String id) {
        this.id = id;
        return this;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public String getDescription() {
        return this.description;
    }
    
    @Override
    public String getId() {
        return this.id;
    }
    
    @Override
    public String getStartDate() {
        return startDate;
    }
    
    @Override
    public String getEndDate() {
        return endDate;
    }
    
    @Override
    public String getTarotCard() {
        return tarotCard;
    }
    
    @Override
    public String getSignElement() {
        return element;
    }
    
    @Override
    public String getRulingPlanet() {
        return rulingPlanet;
    }
    
    @Override
    public String getRulingHouse() {
        return rulingHouse;
    }
    
    @Override
    public String getColor() {
        return color;
    }
    
    @Override
    public String getSisterSign() {
        return sisterSign;
    }
    
    @Override
    public String getModality() {
        return modality;
    }
    
    @Override
    public boolean equivalent(SignCalibratable comparator) {
        return false;
    }
}
