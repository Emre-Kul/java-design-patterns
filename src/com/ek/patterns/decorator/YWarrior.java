package com.ek.patterns.decorator;

public class YWarrior extends WarriorDecorator {

    private Warrior warrior;

    public YWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public int a() {
        return this.warrior.a() + 20;
    }
}
