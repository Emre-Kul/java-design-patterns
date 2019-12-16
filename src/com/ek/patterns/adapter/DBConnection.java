package com.ek.patterns.adapter;

public class DBConnection {

    private IDatabase db;

    public DBConnection() {
        this.db = new NewDBAdapter();
    }

    public void run() {
        this.db.get(12);
        this.db.set(4, "deneme");
    }

}
