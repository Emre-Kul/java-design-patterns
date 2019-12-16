package com.ek.patterns.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapperFactory {

    private Map<String, Mapper> mappers;

    public MapperFactory(ArrayList<Mapper> mapperList) {
        this.mappers = createMapperTable(mapperList);
    }

    public Mapper get(String type) {
        return this.mappers.get(type);
    }

    private Map<String, Mapper> createMapperTable(ArrayList<Mapper> mapperList) {
        Map<String, Mapper> mappers = new HashMap<>();
        for(Mapper mapper: mapperList) {
            mappers.put(mapper.getType(), mapper);
        }
        return mappers;
    }

}
