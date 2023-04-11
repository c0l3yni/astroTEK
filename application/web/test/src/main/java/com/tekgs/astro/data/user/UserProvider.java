package com.tekgs.astro.data.user;

import java.util.List;

public class UserProvider {
    private final UserRepository userRepository = UserRepository.getInstance();

    public static UserProvider getInstance() {
        return new UserProvider();
    }

    public User get (UserDefinition userDefinition) {
          List<User> listOfUsers = userRepository.queryAll();
        for (User user : listOfUsers) {
            if((user.getUsername().equals(userDefinition.getUsername())) && user.getPassword().equals(userDefinition.getPassword()) ) {
                return user;
            }
            return null;
        }
        return null;
    }

}
