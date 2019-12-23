package com.ek.patterns.iterator;
import java.util.Iterator;

public class BasketIterator implements Iterator{

    private Item[] items;
    private int location;
    private int size;

    public BasketIterator(Item[] items, int size) {
        this.items = items;
        this.size = size;
        this.location = 0;
    }

    @Override
    public boolean hasNext() {
        if(location >= size || items[location] == null) return false;
        return true;
    }

    @Override
    public Object next() {
        return items[location++];
    }

}
