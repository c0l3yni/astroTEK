package com.tekgs.astro.view.memberlanding;

public class MemberLandingViewExpected implements MemberLandingViewCalibratable{
    public static MemberLandingViewExpected getInstance() {
        return new MemberLandingViewExpected();
    }

    @Override
    public String getTitle() {
        return "Member";
    }
}
