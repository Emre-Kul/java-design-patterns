package com.ek.patterns.adapter;

public class OldDB implements IDatabase {


    @Override
    public void set(int id, String data) {
        System.out.println("(OLD) Will set data : " + data + " at " + id);
    }

    @Override
    public String get(int id) {
        System.out.println("(OLD) Will get data  at : " + id);
        return "data";
    }
}
