package com.solvd.army.Models.ammo.ammoType;

enum ammoType {
    BALL("Ball"),
    TRACE("Trace"),
    DUMMY("Dummy"),
    BLANK("Blank"),
    SRTA("Srta"),
    TRACER("Tracer");

    private String value;

    ammoType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
