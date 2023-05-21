package com.tekgs.astro.data.user;

import java.util.List;

public class UserProvider {
    UserRepository userRepository = UserRepository.getInstance();
    
    public static UserProvider getInstance() {
        return new UserProvider();
    }
    
    public User get() {
        return this.userRepository.query(UserDefinition.getInstance());
    }
    
    public List<User> getAll() {
        return this.userRepository.query();
    }
}
