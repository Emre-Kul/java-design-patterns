package com.ek.patterns.factory;

public class StringMapper extends Mapper {

    public StringMapper() {
        super("STRING_MAPPER");
    }

    @Override
    public void map() {
        System.out.println("Will map With StringMapper");
    }
}
