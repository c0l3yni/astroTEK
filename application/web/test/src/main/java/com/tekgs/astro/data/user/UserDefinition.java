package com.tekgs.astro.data.user;

@SuppressWarnings("unused")
public class UserDefinition implements UserCalibratable {
    private String username;
    private String password;

    public static UserDefinition getInstance() {
        return new UserDefinition();
    }
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean withValidCredentials() {
        return true;
    }

    public UserDefinition withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserDefinition withPassword(String password) {
        this.password = password;
        return this;
    }
}
