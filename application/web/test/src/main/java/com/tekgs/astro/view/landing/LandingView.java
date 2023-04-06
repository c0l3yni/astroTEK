package com.tekgs.astro.view.landing;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class LandingView extends UiView implements LandingViewCalibratable{
    private static final String DESCRIPTION = "'Landing' View";
    private static final String RELATIVE_URI = "landing";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "landing-view";

    public LandingView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI), UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }

    public static LandingView directNav() {
        new LandingView().load();
        return UiView.expect(LandingView.class);
    }

    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }

    @Override
    public String getTitle() {
        return getTitleElement().getText();
    }

    private UiElement getTitleElement() {
        return UiElement.getInstance("Landing", UiLocatorType.ID, "landing", this.getElement());
    }
}
