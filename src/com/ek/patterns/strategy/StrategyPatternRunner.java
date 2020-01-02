package com.ek.patterns.strategy;

public class StrategyPatternRunner {

    public static void run() {
        ISortStrategy heapSortStrategy = new HeapSortStrategy();
        ISortStrategy mergeSortStrategy = new MergeSortStrategy();
        Sorter sorter = new Sorter(heapSortStrategy);
        sorter.sort();
        sorter = new Sorter(mergeSortStrategy);
        sorter.sort();
    }
}
