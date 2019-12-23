package com.ek.patterns.iterator;

public class Basket {

    private final int ITEM_SIZE = 100;
    private Item[] items;
    private int index;

    public Basket() {
        items = new Item[ITEM_SIZE];
        index = 0;
    }

    public void addItem(Item item) {
        if(index != ITEM_SIZE) {
            this.items[index++] = item;
        }
    }

    public BasketIterator getIterator() {
        return new BasketIterator(items, index);
    }
}
