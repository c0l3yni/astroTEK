package com.tekgs.astro.data.sign;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SignRepository {
    private static final String SIGN_JSON_PATH = "../source/src/data/sign.json";
    
    public static SignRepository getInstance() {
        return new SignRepository();
    }
    
    public Sign query(SignDefinition comparator) {
        for (Sign candidate : this.query()) {
            if (candidate.equivalent(comparator)) {
                return candidate;
            }
        }
        return null;
    }
    
    public List<Sign> query() {
        List<Sign> signList = new ArrayList<>();
        Path path = Paths.get(SIGN_JSON_PATH);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            signList = new Gson().fromJson(reader, new TypeToken<List<Sign>>() {
            }.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return signList;
    }
}
