package com.tekgs.astro.view.landing.signListRegion;

import com.softwareonpurpose.uinavigator.UiRegion;
import com.tekgs.astro.ListCalibrator;
import com.tekgs.astro.view.landing.signListRegion.signRegion.SignRegionCalibratable;
import com.tekgs.astro.view.landing.signListRegion.signRegion.SignRegionCalibrator;

import java.util.ArrayList;
import java.util.List;

public class SignListRegionCalibrator extends ListCalibrator<SignRegionCalibratable, SignRegionCalibrator> {
    
    private static final String DESCRIPTION = "'Sign List' region";
    
    private SignListRegionCalibrator(SignListRegionCalibratable expected, SignListRegionCalibratable actual) {
        super(DESCRIPTION, expected, actual, SignRegionCalibratable.class, SignRegionCalibrator.class);
        UiRegion.suppressConstructionLogging(true);
        List<SignRegionCalibratable> signRegionsExpected = new ArrayList<>(expected.getSignRegions());
        List<SignRegionCalibratable> signRegionsActual = new ArrayList<>(actual.getSignRegions());
        addCalibrationsExpected(signRegionsExpected, signRegionsActual);
        addCalibrationsUnexpected(signRegionsActual);
        UiRegion.suppressConstructionLogging(false);
    }
    
    public static SignListRegionCalibrator getInstance(SignListRegionCalibratable expected, SignListRegionCalibratable actual) {
        return new SignListRegionCalibrator(expected, actual);
    }
    
    @Override
    protected void executeVerifications() {
        // >-|D:   // <---- TODO @ Cole: 4/7/2023 Name new friend
    }
}
