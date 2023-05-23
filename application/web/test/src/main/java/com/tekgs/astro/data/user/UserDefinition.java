package com.tekgs.astro.data.user;

@SuppressWarnings("unused") //  Gson is used to populate the fields
public class UserDefinition implements UserCalibratable {
    private String id;
    private String username;
    private String password;
    
    public static UserDefinition getInstance() {
        return new UserDefinition();
    }

    public UserDefinition withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public UserDefinition withPassword(String password) {
        this.password = password;
        return this;
    }
    
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
        return false;
    }
}
