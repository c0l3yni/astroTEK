package com.tekgs.astro.view.compatability;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class MemberLandingView extends UiView implements CompatibilityViewCalibratable {
    private static final String DESCRIPTION = "'Compatibility' view";
    private static final String RELATIVE_URI = "compatibility";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "compatibility-view";
    
    public MemberLandingView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI), UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }
    
    public static MemberLandingView getInstance() {
        return new MemberLandingView();
    }
    
    public static MemberLandingView directNav() {
        new MemberLandingView().load();
        return UiView.expect(MemberLandingView.class);
    }
    
    private UiElement getHeadingElement() {
        return UiElement.getInstance("'Compatibility' heading", UiLocatorType.ID, "compatibility-heading");
    }
    
    @Override
    public String getHeading() {
        return getHeadingElement().getText();
    }
    
    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
}
