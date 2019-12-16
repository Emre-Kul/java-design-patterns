package com.ek.patterns.factory;

public class NumberMapper extends Mapper {

    public NumberMapper() {
        super("NUMBER_MAPPER");
    }

    @Override
    public void map() {
        System.out.println("Will map With NumberMapper");
    }

}
