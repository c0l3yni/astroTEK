package com.tekgs.astro.view.memberlanding;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class MemberLandingView extends UiView implements MemberLandingViewCalibratable {
    private static final String DESCRIPTION = "'Member Landing' View";
    private static final String RELATIVE_URI = "member-landing";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "member-landing-view";
    public MemberLandingView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI), UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }

    public static MemberLandingView directNav() {
        new MemberLandingView().load();
        return UiView.expect(MemberLandingView.class);
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
        return UiElement.getInstance("'Member Landing' View title", UiLocatorType.ID, "member", this.getElement());
    }
}
