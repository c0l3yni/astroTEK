package com.tekgs.astro.data.user;

public interface UserCalibratable {
    
    String getId();
    
    String getUsername();
    
    String getPassword();
    
    boolean equivalent(UserCalibratable comparator);
}
