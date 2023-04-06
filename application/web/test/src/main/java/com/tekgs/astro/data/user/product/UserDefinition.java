package com.tekgs.astro.data.user.product;

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

    public UserDefinition withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserDefinition withPassword(String password) {
        this.password = password;
        return this;
    }
}
