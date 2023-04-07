package com.tekgs.astro.data.sign;

public class SignProvider {
    private final SignRepository signRepository = SignRepository.getInstance();
    
    public static SignProvider getInstance() {
        return new SignProvider();
    }
    
    public Sign get() {
        return this.signRepository.query(SignDefinition.getInstance());
    }
}
