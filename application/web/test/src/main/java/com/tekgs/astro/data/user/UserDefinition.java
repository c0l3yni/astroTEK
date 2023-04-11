package com.tekgs.astro.data.user;

@SuppressWarnings("unused")
public class UserDefinition implements UserCalibratable {
    public String username;
    public String password;

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
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
