package com.ek.patterns.builder;

public interface ICarBuilder {

    public void setEnginePower(int power);
    public void setWheelCount(int count);
    public Car getCar();

}
