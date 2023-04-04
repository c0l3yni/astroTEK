package com.tekgs.astro.demographic;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class DemographicsView extends UiView implements DemographicsViewCalibratable {
    private static final String DESCRIPTION = "'Demographics' View";
    private static final String RELATIVE_URI = "demographics";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "demographics-view";

    public DemographicsView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI),
                UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }

    public static DemographicsView directNav() {
        new DemographicsView().load();
        return UiView.expect(DemographicsView.class);
    }

    @Override
    public String getInputFormTitle() {
        return getInputFormTitleElement().getText();
    }

    private UiElement getInputFormTitleElement() {
        return UiElement.getInstance("'Demographic' Form Input Title", UiLocatorType.ID,
                "demographics", this.getElement());
    }

    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
}
