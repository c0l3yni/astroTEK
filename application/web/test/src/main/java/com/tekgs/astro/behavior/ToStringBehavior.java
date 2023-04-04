package com.tekgs.astro.behavior;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ToStringBehavior {
    private final Object thingToApplyToStringBehaviorTo; // <- idk what to call this
    
    public ToStringBehavior(Object thingToApplyToStringBehaviorTo) {
        this.thingToApplyToStringBehaviorTo = thingToApplyToStringBehaviorTo;
    }
    
    public static ToStringBehavior getInstance(Object thingToHaveToStringBehaviorAppliedTo) {
        return new ToStringBehavior(thingToHaveToStringBehaviorAppliedTo);
    }
    
    public String execute() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this.thingToApplyToStringBehaviorTo);
    }
}
