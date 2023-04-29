package com.tekgs.astro.view.signDetails.SignDetailsRegion;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiRegion;

import static com.softwareonpurpose.uinavigator.UiLocatorType.ID;

public class SignDetailsRegion extends UiRegion implements SignDetailsRegionCalibratable {
    
    private static final String DESCRIPTION = "Sign Details Region";
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "sign-details-region";
    
    private SignDetailsRegion(UiElement regionElement) {
        super(UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE, regionElement));
    }
    
    public static SignDetailsRegion getInstance(UiElement regionElement) {
        return new SignDetailsRegion(regionElement);
    }
    
    private UiElement getNameElement() {
        return UiElement.getInstance("'Sign Name' text", ID, "sign-name", this.getElement());
    }
    
    private UiElement getDescriptionElement() {
        return UiElement.getInstance("'Sign Description' text", ID, "sign-description", this.getElement());
    }
    
    private UiElement getStartDateElement() {
        return UiElement.getInstance("'Sign Start Date' text", ID, "sign-start-date", this.getElement());
    }
    
    private UiElement getEndDateElement() {
        return UiElement.getInstance("'Sign End Date' text", ID, "sign-end-date", this.getElement());
    }
    
    private UiElement getTarotCardElement() {
        return UiElement.getInstance("'Sign Tarot Card' text", ID, "sign-tarot-card", this.getElement());
    }
    
    private UiElement getSignElementElement() {
        return UiElement.getInstance("'Sign Element' text", ID, "sign-element", this.getElement());
    }
    
    private UiElement getRulingPlanetElement() {
        return UiElement.getInstance("'Sign Ruling Planet' text", ID, "sign-ruling-planet", this.getElement());
    }
    
    private UiElement getRulingHouseElement() {
        return UiElement.getInstance("'Sign Ruling House' text", ID, "sign-ruling-house", this.getElement());
    }
    
    private UiElement getColorElement() {
        return UiElement.getInstance("'Sign Color' text", ID, "sign-color", this.getElement());
    }
    
    private UiElement getSisterSignElement() {
        return UiElement.getInstance("'Sign Sister Sign' text", ID, "sign-sister", this.getElement());
    }
    
    private UiElement getModalityElement() {
        return UiElement.getInstance("'Sign Modality' text", ID, "sign-modality", this.getElement());
    }
    
    @Override
    public String getSignEndDate() {
        return getEndDateElement().getText();
    }
    
    @Override
    public String getSignTarotCard() {
        return getTarotCardElement().getText();
    }
    
    @Override
    public String getSignElement() {
        return getSignElementElement().getText();
    }
    
    @Override
    public String getSignRulingPlanet() {
        return getRulingPlanetElement().getText();
    }
    
    @Override
    public String getSignRulingHouse() {
        return getRulingHouseElement().getText();
    }
    
    @Override
    public String getSignColor() {
        return getColorElement().getText();
    }
    
    @Override
    public String getSignModality() {
        return getModalityElement().getText();
    }
    
    @Override
    public String getSisterSign() {
        return getSisterSignElement().getText();
    }
    
    @Override
    public String getSignName() {
        return getNameElement().getText();
    }
    
    @Override
    public String getSignDescription() {
        return getDescriptionElement().getText();
    }
    
    @Override
    public String getSignStartDate() {
        return getStartDateElement().getText();
    }
}
