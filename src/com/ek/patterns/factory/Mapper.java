package com.ek.patterns.factory;

public abstract class Mapper {

    private String type;

    public Mapper(String type) {
        this.type = type;
    }


    public abstract void map();

    public String getType() {
        return type;
    }
}
