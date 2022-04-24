package com.solvd.army.Models.ammo.ammoType;

public enum AmmoType {
    BALL("Ball"),
    TRACE("Trace"),
    DUMMY("Dummy"),
    BLANK("Blank"),
    SRTA("Srta"),
    TRACER("Tracer");

    private String value;

    AmmoType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
