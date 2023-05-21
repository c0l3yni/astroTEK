package com.tekgs.astro.data.user;

public class UserDefinition implements UserCalibratable {
    
    public static UserDefinition getInstance() {
        return new UserDefinition();
    }
    
    @Override
    public String getId() {
        return null;
    }
    
    @Override
    public String getUsername() {
        return null;
    }
    
    @Override
    public String getPassword() {
        return null;
    }
    
    @Override
    public boolean equivalent(UserCalibratable comparator) {
        return false;
    }
}
