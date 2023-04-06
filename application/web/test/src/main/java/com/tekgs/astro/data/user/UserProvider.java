package com.tekgs.astro.data.user;

import java.util.ArrayList;
import java.util.List;

public class UserProvider {
    private final UserRepository userRepository = UserRepository.getInstance();

    public static UserProvider getInstance() {
        return new UserProvider();
    }

    public User get(UserDefinition userDefinition) {
        return userRepository.query(userDefinition);
    }

//    public User get() {
//        return userRepository.query(UserDefinition.getInstance());
//    }
//    public List<User> getAll() {
//        return userRepository.queryAll();
//    }

//    public List<User> getAllCredentials() {
//        List<UserCalibratable> existingUser = new ArrayList<>();
//        for (UserCalibratable user : listOfUsers) {
//            existingUser.add(user.getUsername());
//        }
//        for (User candidate : getAll()) {
//            if (!existingUser.contains(candidate)) {
//                return candidate;
//            }
//        }
//        return null;
//    }

}
