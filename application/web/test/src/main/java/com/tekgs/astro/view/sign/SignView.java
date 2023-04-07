package com.tekgs.astro.view.sign;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class SignView extends UiView implements SignViewCalibratable {
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String RELATIVE_URI = "sign";
    private static final String DESCRIPTION = "'Sign' view";
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "sign-view";
    
    public SignView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI),
                UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }
    
    public static SignView directNav() {
        new SignView().load();
        return UiView.expect(SignView.class);
    }
    
    private UiElement getSignViewTitleElement() {
        return UiElement.getInstance("'Sign' view", UiLocatorType.ID, "sign", this.getElement());
    }
    
    @Override
    public String getSignViewTitle() {
        return this.getSignViewTitleElement().getText();
    }
    
    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
}
