package com.tekgs.astro.view.login.loginregion;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiRegion;
import com.softwareonpurpose.uinavigator.UiView;
import com.tekgs.astro.data.user.UserDefinition;
import com.tekgs.astro.view.login.LoginView;
import com.tekgs.astro.view.memberlanding.MemberLandingView;

public class LoginRegion extends UiRegion implements LoginRegionCalibratable {
    private static final String DESCRIPTION ="'login' region" ;
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "login-region" ;

    private LoginRegion(UiElement uielement) {
        super(UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE, uielement));
    }

    public static LoginRegion getInstance(UiElement uielement) {
        return new LoginRegion(uielement);
    }

    private UiElement getUsernameFieldElement() {
        return UiElement.getInstance("Username field", UiLocatorType.ID, "username", this.getElement());
    }
    private UiElement getPasswordFieldElement() {
        return UiElement.getInstance("Password field", UiLocatorType.ID, "password", this.getElement());
    }

    private UiElement getSubmitButtonElement() {
        return UiElement.getInstance("form submit button", UiLocatorType.ID, "submit-button", this.getElement());
    }
    private UiElement getBadLoginMessageElement() {
        return UiElement.getInstance("Incorrect login message", UiLocatorType.ID, "bad-credentials", this.getElement());
    }

    @Override
    public String getUsernameField() {
        return getUsernameFieldElement().getText();
    }

    @Override
    public String getBadLoginMessage() {
        return getBadLoginMessageElement().getText();
    }

    @Override
    public String getPasswordField() {
        return getPasswordFieldElement().getText();
    }

    @Override
    public String getSubmitButton() {
        return getSubmitButtonElement().getText();
    }

    public MemberLandingView login(UserDefinition userDefinition) {
        this.getUsernameFieldElement().set(userDefinition.getUsername());
        this.getPasswordFieldElement().set(userDefinition.getPassword());
        getSubmitButtonElement().click();
        return UiView.expect(MemberLandingView.class);
    }

    public LoginView login_fail(UserDefinition userDefinition) {
        this.getUsernameFieldElement().set(userDefinition.getUsername());
        this.getPasswordFieldElement().set(userDefinition.getPassword());
        getSubmitButtonElement().click();
        return UiView.expect(LoginView.class);
    }
}
