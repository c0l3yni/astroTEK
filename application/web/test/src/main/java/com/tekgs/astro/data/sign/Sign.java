package com.tekgs.astro.data.sign;

public class Sign implements SignCalibratable {
    private String id;
    private String name;
    private String description;
    
    @Override
    public String getId() {
        return this.id;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public String getDescription() {
        return this.description;
    }
    
    @Override
    public boolean equivalent(SignCalibratable comparator) {
        if (comparator == null) {
            return false;
        }
        if (comparator.getId() != null && this.getId().equals(comparator.getId())) {
            return true;
        }
        boolean isEquivalent = comparator.getName() == null || this.getName().equals(comparator.getName());
        isEquivalent &= comparator.getDescription() == null || this.getDescription().equals(comparator.getDescription());
        return isEquivalent;
    }
}
