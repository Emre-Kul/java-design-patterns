package com.ek;

import com.ek.patterns.strategy.HeapSortStrategy;
import com.ek.patterns.strategy.ISortStrategy;
import com.ek.patterns.strategy.MergeSortStrategy;
import com.ek.patterns.strategy.Sorter;

public class Main {

    public static void main(String[] args) {
        Main.runStrategyPattern();
    }

    private static void runStrategyPattern() {
        ISortStrategy heapSortStrategy = new HeapSortStrategy();
        ISortStrategy mergeSortStrategy = new MergeSortStrategy();
        Sorter sorter = new Sorter(heapSortStrategy);
        sorter.sort();
        sorter = new Sorter(mergeSortStrategy);
        sorter.sort();
    }
}
