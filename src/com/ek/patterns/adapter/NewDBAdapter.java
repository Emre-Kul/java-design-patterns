package com.ek.patterns.adapter;

public class NewDBAdapter implements IDatabase {

    @Override
    public void set(int id, String data) {
        NewDB db = new NewDB(id);
        db.set(data);
    }

    @Override
    public String get(int id) {
        NewDB db = new NewDB(id);
        return db.get();
    }
}
