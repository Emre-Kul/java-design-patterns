package com.ek.patterns.composite;

public class Developer implements Employee {

    private String name;
    private int id;

    public Developer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void printStatus() {
        System.out.println("Developer" + this.name + " : " + this.id);
    }

}
