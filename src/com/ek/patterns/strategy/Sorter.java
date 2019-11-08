package com.ek.patterns.strategy;

public class Sorter {

    private ISortStrategy sortStrategy;

    public Sorter(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
    public void sort() {
        this.sortStrategy.sort();
    }

}
