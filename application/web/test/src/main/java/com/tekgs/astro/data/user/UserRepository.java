package com.tekgs.astro.data.user;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final String USER_JSON_PATH = "../source/src/data/user.json";
    
    public static UserRepository getInstance() {
        return new UserRepository();
    }
    
    public User query(UserDefinition comparator) {
        for (User candidate : this.query()) {
            if (candidate.equivalent(comparator)) {
                return candidate;
            }
        }
        return null;
    }
    
    public List<User> query() {
        List<User> userList = new ArrayList<>();
        Path path = Paths.get(USER_JSON_PATH);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            userList = new Gson().fromJson(reader, new TypeToken<List<User>>() {
            }.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return userList;
    }
}
