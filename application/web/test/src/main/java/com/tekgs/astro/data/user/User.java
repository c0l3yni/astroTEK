package com.tekgs.astro.data.user;

@SuppressWarnings("unused") //  Gson is used to populate the fields
public class User implements UserCalibratable {
    private String id;
    private String username;
    private String password;
    
    @Override
    public String getId() {
        return this.id;
    }
    
    @Override
    public String getUsername() {
        return this.username;
    }
    
    @Override
    public String getPassword() {
        return this.password;
    }
    
    @Override
    public boolean equivalent(UserCalibratable comparator) {
        if (comparator == null) {
            return false;
        }
        if (this.getId() != null & this.getId().equals(comparator.getId())) {
            return true;
        }
        boolean isEquivalent = comparator.getUsername() == null || this.getUsername().equals(comparator.getUsername());
        isEquivalent &= comparator.getPassword() == null || this.getPassword().equals(comparator.getPassword());
        
        return isEquivalent;
    }
}
