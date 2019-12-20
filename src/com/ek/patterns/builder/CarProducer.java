package com.ek.patterns.builder;

public class CarProducer {

    public void buildFastCar(ICarBuilder carBuilder) {
        carBuilder.setWheelCount(4);
        carBuilder.setEnginePower(1000);
    }

    public void buildSlowCar(ICarBuilder carBuilder) {
        carBuilder.setWheelCount(2);
        carBuilder.setEnginePower(100);
    }

}
