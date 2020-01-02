package com.ek.patterns.factory;

import java.util.ArrayList;

public class FactoryPatternRunner {

    public static void run() {
        ArrayList<Mapper> mappers = new ArrayList<>();
        mappers.add(new NumberMapper());
        mappers.add(new StringMapper());
        MapperFactory factory = new MapperFactory(mappers);
        Mapper m1 = factory.get("NUMBER_MAPPER");
        Mapper m2 = factory.get("STRING_MAPPER");
        m1.map();
        m2.map();
    }

}
