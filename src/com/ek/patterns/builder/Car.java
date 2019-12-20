package com.ek.patterns.builder;

public class Car {

    private String type;
    private int enginePower;
    private int wheelCount;

    public Car(String type, int enginePower, int wheelCount) {
        this.type = type;
        this.enginePower = enginePower;
        this.wheelCount = wheelCount;
    }

    public int getEnginePower() {
        return enginePower;
    }
    public int getWheelCount() {
        return wheelCount;
    }

    public String getType() {
        return type;
    }

    public void printOut() {
        System.out.println(this.type + " : " + this.enginePower + " : " + this.wheelCount);
    }
}
