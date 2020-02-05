package com.ek.patterns.singleton.eager;

public class EagerBillPughSingleton {
    private String name;

    private EagerBillPughSingleton(String name) {
        this.name = name;
    }

    private static class InstanceHolder {
        private static final EagerBillPughSingleton instance = new EagerBillPughSingleton("eager singleton bill pugh approach");
    }

    public static EagerBillPughSingleton getInstance(){
        return InstanceHolder.instance;
    }

    public String getName() {
        return name;
    }
}
