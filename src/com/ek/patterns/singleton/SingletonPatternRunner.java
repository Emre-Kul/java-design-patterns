package com.ek.patterns.singleton;

public class SingletonPatternRunner {

    public static void run() {
        Singleton singleton1 = Singleton.create("emre");
        Singleton singleton2 = Singleton.create("emre-2");
        System.out.println(singleton1.getName());
        System.out.println(singleton2.getName());
    }

}
