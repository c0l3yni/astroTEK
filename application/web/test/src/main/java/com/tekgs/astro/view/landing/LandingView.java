package com.tekgs.astro.view.landing;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import com.tekgs.astro.view.demographic.DemographicsView;
import com.tekgs.astro.view.login.LoginView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class LandingView extends UiView implements LandingViewCalibratable {
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

    private UiElement getTitleElement() {
        return UiElement.getInstance("Landing", UiLocatorType.ID, "landing", this.getElement());
    }
    
    public LoginView toLoginView() {
        this.getNavToLoginElement().click();
        return UiView.expect(LoginView.class);
    }
    
    private UiElement getNavToLoginElement() {
        return UiElement.getInstance("link to 'Login View'", UiLocatorType.ID,"nav-to-login",  this.getElement());
    }
    
    public DemographicsView toDemographicsView() {
        this.getNavToDemographicsElement().click();
        return UiView.expect(DemographicsView.class);
    }
    
    private UiElement getNavToDemographicsElement() {
        return UiElement.getInstance("link to 'Demographics View", UiLocatorType.ID, "nav-to-demographics", this.getElement());
    }
    
    @Override
    public String getTitle() {
        return getTitleElement().getText();
    }
    
    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
    
}
