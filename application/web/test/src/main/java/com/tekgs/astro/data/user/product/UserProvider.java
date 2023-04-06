package com.tekgs.astro.data.user.product;

public class UserProvider {
    private final UserRepository userRepository = UserRepository.getInstance();

    public static UserProvider getInstance() {
        return new UserProvider();
    }

    public User get() {
        return userRepository.query(UserDefinition.getInstance());
    }

}
