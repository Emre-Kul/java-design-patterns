package com.ek.patterns.decorator;

public class DecoratorPatternRunner {

    public static void run() {
        Warrior warrior = new Warrior();
        Warrior xWarrior = new XWarrior(warrior);
        Warrior y1Warrior = new YWarrior(warrior);
        Warrior y2Warrior = new YWarrior(xWarrior);
        System.out.println("Warrior : " + warrior.a());
        System.out.println("XWarrior : " + xWarrior.a());
        System.out.println("Y1Warrior : " + y1Warrior.a());
        System.out.println("Y2Warrior : " + y2Warrior.b());
    }
}
