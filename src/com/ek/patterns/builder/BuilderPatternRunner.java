package com.ek.patterns.builder;

public class BuilderPatternRunner {

    public static void run() {
        CarProducer carProducer = new CarProducer();
        ICarBuilder automaticCarBuilder = new AutomaticCarBuilder();
        ICarBuilder manualCarBuilder = new ManualCarBuilder();

        carProducer.buildFastCar(automaticCarBuilder);
        Car automaticFastCar = automaticCarBuilder.getCar();
        automaticFastCar.printOut();

        carProducer.buildSlowCar(automaticCarBuilder);
        Car automaticSlowCar = automaticCarBuilder.getCar();
        automaticSlowCar.printOut();

        carProducer.buildFastCar(manualCarBuilder);
        Car manualFastCar = manualCarBuilder.getCar();
        manualFastCar.printOut();

        carProducer.buildSlowCar(manualCarBuilder);
        Car manualSlowCar = manualCarBuilder.getCar();
        manualSlowCar.printOut();
    }
}
