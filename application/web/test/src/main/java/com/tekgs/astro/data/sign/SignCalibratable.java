package com.tekgs.astro.data.sign;

public interface SignCalibratable {
    String getName();
    
    String getDescription();
    
    String getId();
    
    boolean equivalent(SignCalibratable comparator);
}
