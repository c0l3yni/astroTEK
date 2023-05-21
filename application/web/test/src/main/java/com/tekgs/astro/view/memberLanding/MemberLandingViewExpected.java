package com.tekgs.astro.view.memberLanding;

public class MemberLandingViewExpected implements MemberLandingViewCalibratable {
    
    private MemberLandingViewExpected() {
    }
    
    public static MemberLandingViewExpected getInstance() {
        return new MemberLandingViewExpected();
    }
    
    @Override
    public String getHeading() {
        return "Member Landing";
    }
}
