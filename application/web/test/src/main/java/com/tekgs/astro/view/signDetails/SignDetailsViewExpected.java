package com.tekgs.astro.view.signDetails;

import com.tekgs.astro.data.sign.Sign;
import com.tekgs.astro.view.signDetails.SignDetailsRegion.SignDetailsRegionCalibratable;
import com.tekgs.astro.view.signDetails.SignDetailsRegion.SignDetailsRegionExpected;

public class SignDetailsViewExpected implements SignDetailsViewCalibratable {
    private final Sign sign;
    
    private SignDetailsViewExpected(Sign sign) {
        this.sign = sign;
    }
    
    public static SignDetailsViewExpected getInstance() {
        return new SignDetailsViewExpected(null);
    }
    
    public static SignDetailsViewExpected getInstance(Sign sign) {
        return new SignDetailsViewExpected(sign);
    }
    
    @Override
    public String getHeading() {
        return "Sign Details";
    }

    @Override
    public SignDetailsRegionCalibratable inSignDetailsRegion() {
        return SignDetailsRegionExpected.getInstance(this.sign);
    }
}
