package com.ek.patterns.singleton.eager;

public class EagerWithStaticInitSingleton {
    private String name;
    private static EagerWithStaticInitSingleton instance;

    // static initialization scope, helps us to exception handling.
    static{
        try{
            instance = new EagerWithStaticInitSingleton("Static initialization");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private EagerWithStaticInitSingleton(String name){
        this.name = name;
    }

    public static EagerWithStaticInitSingleton getInstance(){
        return instance;
    }

    public String getName(){
        return name;
    }
}
