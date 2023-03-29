package com.tekgs.nextgen.duckies.view.landing;
import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;

public class LandingView extends UiView implements LandingViewCalibratable{
    private static final String LOCATOR_VALUE = "landing-page";
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String RELATIVE_URI = "landing-page";

    public LandingView() {
        super(RELATIVE_URI, UiElement.getInstance("'Landing' View", LOCATOR_TYPE, LOCATOR_VALUE));
    }

    public static LandingView directNav() {
        new LandingView().load();
        return UiView.expect(LandingView.class);
    }

    private UiElement getLandingMessageElement() {
        return UiElement.getInstance("Landing view", UiLocatorType.ID, "landing", this.getElement());
    }

    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }

    @Override
    public String getLandingMessage() {
        return getLandingMessageElement().getText();
    }
}
