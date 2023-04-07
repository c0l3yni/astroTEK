package com.tekgs.astro.data.sign;

import java.util.List;

public class SignProvider {
    private final SignRepository signRepository = SignRepository.getInstance();
    
    public static SignProvider getInstance() {
        return new SignProvider();
    }
    
    public Sign get() {
        return this.signRepository.query(SignDefinition.getInstance());
    }
    
    public List<Sign> getAll() {
        return this.signRepository.query();
    }
}
