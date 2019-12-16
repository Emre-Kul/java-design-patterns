package com.ek.patterns.singleton;

public class Singleton {

    private String name;
    private static Singleton instance;

    private Singleton(String name) {
        this.name = name;
    }

    public static synchronized Singleton create(String name) { // synchronized for thread safety
        if(Singleton.instance == null) {
            Singleton.instance = new Singleton(name);
        }
        return Singleton.instance;
    }

    public String getName() {
        return this.name;
    }

}
