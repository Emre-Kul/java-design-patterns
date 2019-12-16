package com.ek.patterns.adapter;

public class NewDB {
    private int id;

    public NewDB(int id) {
        this.id = id;
    }

    public void set(String data) {
        System.out.println("(NEW) Will set data : " + data + " at " + this.id);
    }

    public String get() {
        System.out.println("(NEW) Will get data  at : " + id);
        return "data";
    }

}
