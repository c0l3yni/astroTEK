package com.tekgs.astro.view.signDetails;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import com.tekgs.astro.view.signDetails.SignDetailsRegion.SignDetailsRegion;
import com.tekgs.astro.view.signDetails.SignDetailsRegion.SignDetailsRegionCalibratable;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class SignDetailsView extends UiView implements SignDetailsViewCalibratable {
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String RELATIVE_URI = "sign";
    private static final String DESCRIPTION = "'Sign' view";
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "sign-view";
    
    public SignDetailsView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI),
                UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }
    
    public static SignDetailsView directNav(String id) {
        new SignDetailsView().load(String.format("?sign_id=%s", id));
        return UiView.expect(SignDetailsView.class);
    }
    
    private UiElement getTitleElement() {
        return UiElement.getInstance("'Sign' view", UiLocatorType.ID, "sign", this.getElement());
    }
    
    @Override
    public String getSignViewTitle() {
        return this.getTitleElement().getText();
    }

    @Override
    public SignDetailsRegion inSignDetailsRegion() {
        return SignDetailsRegion.getInstance(this.getElement());
    }

    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
}
