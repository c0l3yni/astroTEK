package com.tekgs.astro.data.sign;

public class SignDefinition implements SignCalibratable {
    private String id;
    private String name;
    private String description;
    
    public static SignDefinition getInstance() {
        return new SignDefinition();
    }
    
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
        return false;
    }
}
