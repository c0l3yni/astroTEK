package com.tekgs.astro.view.memberLanding;

import com.tekgs.astro.data.user.User;
import com.tekgs.astro.data.user.UserDefinition;
import com.tekgs.astro.data.user.UserProvider;

public class MemberLandingViewExpected implements MemberLandingViewCalibratable {
    private final UserDefinition loginAttempt;
    private final User user;
    
    private MemberLandingViewExpected(UserDefinition loginAttempt) {
        this.loginAttempt = loginAttempt;
        this.user = UserProvider.getInstance().get(UserDefinition.getInstance().withUsername(loginAttempt.getUsername()));
    }
    
    public static MemberLandingViewExpected getInstance() {
        return new MemberLandingViewExpected(null);
    }
    
    public static MemberLandingViewExpected getInstance(UserDefinition loginAttempt) {
        return new MemberLandingViewExpected(loginAttempt);
    }
    
    private boolean isUserValid() {
        return this.user != null && this.user.getPassword().equals(this.loginAttempt.getPassword());
    }
    
    @Override
    public String getHeading() {
        return "Member Landing";
    }
    
    @Override
    public String getWelcomeMessage() {
        return this.isUserValid() ? "Welcome, " + this.user.getUsername() : "Welcome, Guest";
    }
}
