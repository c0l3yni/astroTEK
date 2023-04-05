package com.tekgs.astro.login;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import com.tekgs.astro.login.loginregion.LoginRegion;
import com.tekgs.astro.login.loginregion.LoginRegionCalibratable;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class LoginView extends UiView implements LoginViewCalibratable {
    private static final String DESCRIPTION = "'Login' View";
    private static final String RELATIVE_URI = "login";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "login-view";

    public LoginView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI), UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }

    public static LoginView directNav() {
        new LoginView().load();
        return UiView.expect(LoginView.class);
    }

    private UiElement getLoginTitleElement() {
        return UiElement.getInstance("Login", UiLocatorType.ID, "login", this.getElement());
    }

    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }

    @Override
    public String getLoginTitle() {
        return getLoginTitleElement().getText();
    }

    @Override
    public LoginRegionCalibratable inLoginRegion() {
        return LoginRegion.getInstance(this.getElement());
    }
}
