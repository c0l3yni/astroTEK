package com.tekgs.astro.view.compatability;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class CompatibilityView extends UiView implements CompatibilityViewCalibratable {
    private static final String DESCRIPTION = "'Compatibility' view";
    private static final String RELATIVE_URI = "compatibility";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "compatibility-view";
    
    public CompatibilityView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI), UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }
    
    public static CompatibilityView getInstance() {
        return new CompatibilityView();
    }
    
    public static CompatibilityView directNav() {
        new CompatibilityView().load();
        return UiView.expect(CompatibilityView.class);
    }
    
    private UiElement getCompatibilityCalculatorTitleElement() {
        return UiElement.getInstance("Compatibility Calculator Title", UiLocatorType.ID, "compatibility");
    }
    
    @Override
    public String getCompatibilityCalculatorTitle() {
        return getCompatibilityCalculatorTitleElement().getText();
    }
    
    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
}
