package com.ek.patterns.observer;

import java.util.ArrayList;

public class Subject {

    private ArrayList<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void register(Observer o) {
        this.observers.add(o);
    }

    public void unRegister(Observer o) {
        this.observers.remove(o);
    }

    public void notify(String message) {
        for(Observer observer: this.observers) {
            observer.update(message);
        }
    }

}
