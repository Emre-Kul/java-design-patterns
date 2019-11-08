package com.ek.patterns.strategy;

public class HeapSortStrategy implements ISortStrategy {

    @Override
    public void sort() {
        System.out.println("Will Sort With HeapSort Strategy");
    }
}
