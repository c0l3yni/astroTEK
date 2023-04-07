package com.tekgs.astro.view.landing.signListRegion;

import com.tekgs.astro.ListCalibrator;
import com.tekgs.astro.view.landing.signListRegion.signRegion.SignRegionCalibratable;
import com.tekgs.astro.view.landing.signListRegion.signRegion.SignRegionCalibrator;

public class SignListRegionCalibrator extends ListCalibrator<SignRegionCalibratable, SignRegionCalibrator> {

    private static final String DESCRIPTION = "'Sign List' region";
    
    public SignListRegionCalibrator(SignListRegionExpected expected, SignListRegion actual, Class<SignRegionCalibratable> childCalibratable, Class<SignRegionCalibrator> childCalibrator) {
        super(DESCRIPTION, expected, actual, childCalibratable, childCalibrator);
    }
}
