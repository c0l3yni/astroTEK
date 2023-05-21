package com.tekgs.astro.view.signDetails;

import com.tekgs.astro.view.signDetails.SignDetailsRegion.SignDetailsRegionCalibratable;

public interface SignDetailsViewCalibratable {
    String getHeading();
    
    SignDetailsRegionCalibratable inSignDetailsRegion();
}
