package com.ek.patterns.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance;
    private String name;

    private LazyDoubleCheckSingleton(String name) {
        this.name = name;
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if(instance == null){
                    instance = new LazyDoubleCheckSingleton("lazy singleton with double check");
                }
            }
        }

        return instance;
    }

    public String getName(){
        return name;
    }
}
