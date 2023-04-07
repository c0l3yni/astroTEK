package com.tekgs.astro.view.landing.signListRegion;

import com.tekgs.astro.data.sign.Sign;
import com.tekgs.astro.data.sign.SignProvider;
import com.tekgs.astro.view.landing.signListRegion.signRegion.SignRegionCalibratable;
import com.tekgs.astro.view.landing.signListRegion.signRegion.SignRegionExpected;

import java.util.ArrayList;
import java.util.List;

public class SignListRegionExpected implements SignListRegionCalibratable {
    private final List<Sign> signList;
    
    public SignListRegionExpected() {
        this.signList = SignProvider.getInstance().getAll();
    }
    
    public static SignListRegionExpected getInstance() {
        return new SignListRegionExpected();
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
