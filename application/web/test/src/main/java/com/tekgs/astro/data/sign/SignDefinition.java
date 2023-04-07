package com.tekgs.astro.data.sign;

public class SignDefinition implements SignCalibratable {
    
    public static SignDefinition getInstance() {
        return new SignDefinition();
    }
    
    @Override
    public String getSignName() {
        return null;
    }
    
    @Override
    public String getSignInfo() {
        return null;
    }
}
