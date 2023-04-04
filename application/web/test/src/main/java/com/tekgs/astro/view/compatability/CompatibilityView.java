package com.tekgs.astro.view.compatability;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class CompatibilityView extends UiView implements CompatibilityViewCalibratable {
    private static final String DESCRIPTION = "'Compatability' View";
    private static final String RELATIVE_URI = "compatability";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "compatability-view";

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

    @Override
    public String getCompatabilityCalculatorTitle() {
        return getCompatabilityCalculatorTitleElement().getText();
    }

    private UiElement getCompatabilityCalculatorTitleElement() {
        return UiElement.getInstance("Compatability Calculator Title", UiLocatorType.ID, "compatability");
    }

    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
}
