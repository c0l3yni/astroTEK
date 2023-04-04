package com.tekgs.astro.view.compatabilitycalc;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class CompatibilityCalcView extends UiView implements CompatibilityCalcViewCalibratable {
    private static final String DESCRIPTION = "'Compatability Calculator' View";
    private static final String RELATIVE_URI = "compatability";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "compatability-view";

    public CompatibilityCalcView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI), UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }

    public static CompatibilityCalcView getInstance() {
        return new CompatibilityCalcView();
    }

    public static CompatibilityCalcView directNav() {
        new CompatibilityCalcView().load();
        return UiView.expect(CompatibilityCalcView.class);
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
