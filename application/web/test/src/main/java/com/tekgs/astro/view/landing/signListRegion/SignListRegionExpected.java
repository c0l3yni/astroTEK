package com.tekgs.astro.view.landing.signListRegion;

import com.tekgs.astro.data.sign.Sign;
import com.tekgs.astro.view.landing.signListRegion.signRegion.SignRegionCalibratable;
import com.tekgs.astro.view.landing.signListRegion.signRegion.SignRegionExpected;

import java.util.ArrayList;
import java.util.List;

public class SignListRegionExpected implements SignListRegionCalibratable {
    
    
    private final List<Sign> signList = new ArrayList<>();
    
    public SignListRegionExpected(List<Sign> signList) {
        this.signList.addAll(signList);
    }
    
    public static SignListRegionExpected getInstance(List<Sign> signList) {
        return new SignListRegionExpected(signList);
    }
    
    @Override
    public List<SignRegionCalibratable> getSignRegions() {
        List<SignRegionCalibratable> signRegions = new ArrayList<>();
        this.signList.forEach(sign -> {
            signRegions.add(SignRegionExpected.getInstance(sign));
        });
        return signRegions;
    }
}
