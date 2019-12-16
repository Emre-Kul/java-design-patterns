package com.ek.patterns.decorator;

public class XWarrior extends WarriorDecorator {

    private Warrior warrior;
    public XWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public int a() {
        return this.warrior.a() + 10;
    }
}
