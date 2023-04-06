package com.tekgs.astro.view.login.loginregion;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiRegion;
import com.softwareonpurpose.uinavigator.UiView;
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

    public MemberLandingView clickButton() {
        getSubmitButtonElement().click();
        return UiView.expect(MemberLandingView.class);
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
    private UiElement getSuccessfulLoginMessageElement() {
        return UiElement.getInstance("Success message", UiLocatorType.ID, "success", this.getElement());
    }
//    @Override
//    public boolean isUsernameFieldDisplayed() {
//        String isDisabled = getUsernameFieldElement().getAttribute("disabled");
//        return isDisabled == null;
//    }
    @Override
    public String getUsernameField() {
        return getUsernameFieldElement().getText();
    }

//    @Override
//    public String getSuccessfulLoginMessage() {
//        return getSuccessfulLoginMessageElement().getText();
//    }

    @Override
    public String getPasswordField() {
        return getPasswordFieldElement().getText();
    }

    @Override
    public String getSubmitButton() {
        return getSubmitButtonElement().getText();
    }
}
