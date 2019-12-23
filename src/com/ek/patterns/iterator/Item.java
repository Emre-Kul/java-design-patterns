package com.ek.patterns.iterator;

public class Item {

    private String name;
    private float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Item : " + this.name + " Price : " + this.price);
    }
}
