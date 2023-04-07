package com.tekgs.astro.view.landing.signListRegion.signRegion;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;
import com.softwareonpurpose.uinavigator.UiView;
import com.tekgs.astro.view.signDetails.SignDetailsView;

public class SignRegion extends UiRegion implements SignRegionCalibratable {
    private SignRegion(UiElement signElement) {
        super(signElement);
    }
    
    public static SignRegion getInstance(UiElement signElement) {
        return new SignRegion(signElement);
    }
    
    public SignDetailsView toSignDetailsView() {
        String id = this.getElement().getAttribute("data-sign");
        this.getElement().click();
//        new SignDetailsView().load(); <- can't do this here bc of protected access
        return UiView.expect(SignDetailsView.class);
    }
    
    @Override
    public String getSignName() {
        return this.getElement().getText();
    }
    
    @Override
    public boolean equivalent(SignRegionCalibratable comparator) {
        if (comparator == null) {
            return false;
        }
        return comparator.getSignName() == null || this.getSignName().equals(comparator.getSignName());
    }
}
