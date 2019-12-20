package com.ek.patterns.builder;

public class AutomaticCarBuilder implements ICarBuilder {

    private int enginePower = 0;
    private int wheelCount = 0;

    @Override
    public void setEnginePower(int power) {
        this.enginePower = power;
    }

    @Override
    public void setWheelCount(int count) {
        this.wheelCount = count;
    }

    @Override
    public Car getCar() {
        return new Car("AUTOMATIC", this.enginePower, this.wheelCount);
    }
}
