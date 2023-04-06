package com.tekgs.astro.data.user.product;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static UserRepository getInstance() {
        return new UserRepository();
    }

    public User query(UserDefinition definition) {
        for(User candidate:getUsersFromJSON()){
            if(candidate.equivalent(definition)){
                return candidate;
            }
        }
        return null;
    }

    private List<User> getUsersFromJSON() {
        List<User> userList = new ArrayList<>();
        Path path = Paths.get("../source/src/data/users.json");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            userList = new Gson().fromJson(reader, new TypeToken<List<User>>() {
            }.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return userList;
    }
}
