package com.tekgs.astro.data.sign;

import java.util.ArrayList;
import java.util.List;

public class SignRepository {
    public static SignRepository getInstance() {
        return new SignRepository();
    }
    
    public Sign query(SignDefinition comparator) {
        return null;
    }
    
    public List<Sign> query() {
        List<Sign> signList = new ArrayList<>();
        
        return signList;
    }
}
