package com.tekgs.astro.view.landing.signListRegion;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiRegion;
import com.tekgs.astro.view.landing.signListRegion.signRegion.SignRegion;
import com.tekgs.astro.view.landing.signListRegion.signRegion.SignRegionCalibratable;

import java.util.ArrayList;
import java.util.List;

public class SignListRegion extends UiRegion implements SignListRegionCalibratable {
    private static final String DESCRIPTION = "Sign List' region";
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "sign-list-region";
    
    private SignListRegion(UiElement parentElement) {
        super(UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE, parentElement));
    }
    
    public static SignListRegion getInstance(UiElement parentElement) {
        return new SignListRegion(parentElement);
    }
    
    public SignRegion getSignRegion(String id) {
        UiElement signElement = UiElement.getInstance("'Sign' region", UiLocatorType.CLASS, "sign-region", "data-sign", id, this.getElement());
        return SignRegion.getInstance(signElement);
    }
    
    @Override
    public List<SignRegionCalibratable> getSignRegions() {
        List<UiElement> signElements = UiElement.getList("'Sign' region", UiLocatorType.CLASS, "sign-region", this.getElement());
        List<SignRegionCalibratable> signRegions = new ArrayList<>();
        
        signElements.forEach(signElement -> {
            signRegions.add(SignRegion.getInstance(signElement));
        });
        
        return signRegions;
    }
}
