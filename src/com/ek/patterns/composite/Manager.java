package com.ek.patterns.composite;

public class Manager implements Employee {

    private String name;

    public  Manager(String name) {
        this.name = name;
    }

    @Override
    public void printStatus() {
        System.out.println("Manager"  + this.name);
    }
}
