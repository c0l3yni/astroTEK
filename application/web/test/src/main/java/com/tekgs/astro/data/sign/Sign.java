package com.tekgs.astro.data.sign;

@SuppressWarnings("unused") //  Gson is used to populate the fields
public class Sign implements SignCalibratable {
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
    
    @Override
    public String getId() {
        return this.id;
    }
    
    @Override
    public String getStartDate() {
        return this.startDate;
    }
    
    @Override
    public String getEndDate() {
        return this.endDate;
    }
    
    @Override
    public String getTarotCard() {
        return this.tarotCard;
    }
    
    @Override
    public String getSignElement() {
        return this.element;
    }
    
    @Override
    public String getRulingPlanet() {
        return this.rulingPlanet;
    }
    
    @Override
    public String getRulingHouse() {
        return this.rulingHouse;
    }
    
    @Override
    public String getColor() {
        return this.color;
    }
    
    @Override
    public String getSisterSign() {
        return this.sisterSign;
    }
    
    @Override
    public String getModality() {
        return this.modality;
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
    public boolean equivalent(SignCalibratable comparator) {
        if (comparator == null) {
            return false;
        }
//        if (comparator.getId() != null && this.getId().equals(comparator.getId())) {
//            return true;
//        }
        boolean isEquivalent = comparator.getName() == null || this.getName().equals(comparator.getName());
        isEquivalent &= comparator.getDescription() == null || this.getDescription().equals(comparator.getDescription());
        isEquivalent &= comparator.getColor() == null || this.getColor().equals(comparator.getColor());
        isEquivalent &= comparator.getSignElement() == null || this.getSignElement().equals(comparator.getSignElement());
        isEquivalent &= comparator.getSisterSign() == null || this.getSisterSign().equals(comparator.getSisterSign());
        isEquivalent &= comparator.getEndDate() == null || this.getEndDate().equals(comparator.getEndDate());
        isEquivalent &= comparator.getModality() == null || this.getModality().equals(comparator.getModality());
        isEquivalent &= comparator.getRulingHouse() == null || this.getRulingHouse().equals(comparator.getRulingHouse());
        isEquivalent &= comparator.getRulingPlanet() == null || this.getRulingPlanet().equals(comparator.getRulingPlanet());
        isEquivalent &= comparator.getStartDate() == null || this.getStartDate().equals(comparator.getStartDate());
        isEquivalent &= comparator.getTarotCard() == null || this.getTarotCard().equals(comparator.getTarotCard());
        return isEquivalent;
    }
}
