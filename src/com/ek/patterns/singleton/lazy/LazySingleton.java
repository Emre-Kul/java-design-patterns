package com.ek.patterns.singleton.lazy;

public class LazySingleton {

    private String name;
    private static LazySingleton instance;

    private LazySingleton(String name) {
        this.name = name;
    }

    public static synchronized LazySingleton create(String name) { // synchronized for thread safety
        if (LazySingleton.instance == null) {
            LazySingleton.instance = new LazySingleton(name);
        }
        return LazySingleton.instance;
    }

    public String getName() {
        return this.name;
    }
}