package com.ek.patterns.builder;

public class ManualCarBuilder implements ICarBuilder {

    private int enginePower;
    private int wheelCount;

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
        return new Car("MANUAL", this.enginePower, this.wheelCount);
    }

}
