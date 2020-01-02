package com.ek.patterns.iterator;

public class IteratorPatternRunner {

    public static void run() {

        Basket basket = new Basket();
        basket.addItem(new Item("XX", 9.90f));
        basket.addItem(new Item("YY", 8.90f));
        basket.addItem(new Item("ZZ", 92.90f));
        BasketIterator basketIterator = basket.getIterator();
        while (basketIterator.hasNext()) {
            Item item = (Item)basketIterator.next();
            item.print();
        }
    }

}
