package com.ek.patterns.adapter;

public class AdapterPatternRunner {

    public static void run() {
        DBConnection dbConnection = new DBConnection();
        dbConnection.run();
    }
}
