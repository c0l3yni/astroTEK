package com.tekgs.astro.view.landing;

import com.tekgs.astro.data.sign.Sign;
import com.tekgs.astro.view.landing.signListRegion.SignListRegionExpected;

import java.util.List;

public class LandingViewExpected implements LandingViewCalibratable{
    
    private List<Sign> signList;
    
    private LandingViewExpected() {
    }
    
    public static LandingViewExpected getInstance() {
        return new LandingViewExpected();
    }

    @Override
    public String getTitle() {
        return "Home";
    }
    
    @Override
    public SignListRegionExpected getSignListRegion() {
        return SignListRegionExpected.getInstance(signList);
    }
}
