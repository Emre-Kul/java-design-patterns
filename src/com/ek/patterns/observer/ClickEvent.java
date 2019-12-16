package com.ek.patterns.observer;

public class ClickEvent implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Will process message : " + message + " in Click Event");
    }

}
