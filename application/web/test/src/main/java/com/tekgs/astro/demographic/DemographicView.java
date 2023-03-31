package com.tekgs.astro.demographic;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class DemographicView extends UiView implements DemographicViewCalibratable{
    private static final String DESCRIPTION = "'Demographic' View";
    private static final String RELATIVE_URI = "demographic";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "demographic-view";

    public DemographicView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI),
                UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }

    public static DemographicView directNav() {
        new DemographicView().load();
        return UiView.expect(DemographicView.class);
    }

    @Override
    public String getInputFormTitle() {
        return getInputFormTitleElement().getText();
    }

    private UiElement getInputFormTitleElement() {
        return UiElement.getInstance("'Demographic' Form Input Title", UiLocatorType.ID,
                "demographic", this.getElement());
    }

    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
}
