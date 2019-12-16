package com.ek.patterns.decorator;

public class Warrior {

    private int hp;

    public Warrior() {
        this.hp = 100;
    }

    public int a() {
        return this.hp;
    }
    public int b() { return this.hp * 10; }
}
