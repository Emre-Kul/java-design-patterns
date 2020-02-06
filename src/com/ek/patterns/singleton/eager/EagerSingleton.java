package com.ek.patterns.singleton.eager;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton("Eager Singleton");
    private final String name;

    private EagerSingleton(String name){
        this.name = name;
    }

    public static EagerSingleton getInstance(){     // since we are initializing instance when class is loaded so we don't need to initialize or set or check.
        return instance;
    }

    public String getName(){
        return name;
    }
}
