package com.tekgs.astro.view.login;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import com.tekgs.astro.data.user.UserDefinition;
import com.tekgs.astro.view.memberLanding.MemberLandingView;
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
    
    public MemberLandingView submitLogin(UserDefinition user) {
        this.getUsernameInputElement().set(user.getUsername());
        this.getPasswordInputElement().set(user.getPassword());
        this.getLoginButtonElement().click();
        return UiView.expect(MemberLandingView.class);
    }
    
    private UiElement getHeadingElement() {
        return UiElement.getInstance("'Login' heading", UiLocatorType.ID, "login-heading", this.getElement());
    }
    
    private UiElement getUsernameInputElement() {
        return UiElement.getInstance("'Username' input", UiLocatorType.NAME, "username-input", this.getElement());
    }
    
    private UiElement getPasswordInputElement() {
        return UiElement.getInstance("'Password' input", UiLocatorType.NAME, "password-input", this.getElement());
    }
    
    private UiElement getLoginButtonElement() {
        return UiElement.getInstance("'Login' button", UiLocatorType.ID, "login-button", this.getElement());
    }
    
    @Override
    public String getHeading() {
        return getHeadingElement().getText();
    }
    
    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
}
