package com.ek;

import com.ek.patterns.adapter.DBConnection;
import com.ek.patterns.chainofresponsibility.ARequestHandler;
import com.ek.patterns.chainofresponsibility.BRequestHandler;
import com.ek.patterns.chainofresponsibility.RequestHandler;
import com.ek.patterns.facade.AtmFacade;
import com.ek.patterns.observer.ClickEvent;
import com.ek.patterns.observer.KeyboardEvent;
import com.ek.patterns.observer.Subject;
import com.ek.patterns.decorator.Warrior;
import com.ek.patterns.decorator.XWarrior;
import com.ek.patterns.decorator.YWarrior;
import com.ek.patterns.factory.Mapper;
import com.ek.patterns.factory.MapperFactory;
import com.ek.patterns.factory.NumberMapper;
import com.ek.patterns.factory.StringMapper;
import com.ek.patterns.singleton.Singleton;
import com.ek.patterns.strategy.HeapSortStrategy;
import com.ek.patterns.strategy.ISortStrategy;
import com.ek.patterns.strategy.MergeSortStrategy;
import com.ek.patterns.strategy.Sorter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main.runStrategyPattern();
        Main.runFactoryPattern();
        Main.runDecoratorPattern();
        Main.runObserverPattern();
        Main.runChainOfResponsibilityPattern();
        Main.runSingletonPattern();
        Main.runAdapterPattern();
        Main.runFacadePattern();
    }

    private static void runStrategyPattern() {
        ISortStrategy heapSortStrategy = new HeapSortStrategy();
        ISortStrategy mergeSortStrategy = new MergeSortStrategy();
        Sorter sorter = new Sorter(heapSortStrategy);
        sorter.sort();
        sorter = new Sorter(mergeSortStrategy);
        sorter.sort();
    }

    private static void runFactoryPattern() {
        ArrayList<Mapper> mappers = new ArrayList<>();
        mappers.add(new NumberMapper());
        mappers.add(new StringMapper());
        MapperFactory factory = new MapperFactory(mappers);
        Mapper m1 = factory.get("NUMBER_MAPPER");
        Mapper m2 = factory.get("STRING_MAPPER");
        m1.map();
        m2.map();
    }

    private static void runDecoratorPattern() {
        Warrior warrior = new Warrior();
        Warrior xWarrior = new XWarrior(warrior);
        Warrior y1Warrior = new YWarrior(warrior);
        Warrior y2Warrior = new YWarrior(xWarrior);
        System.out.println("Warrior : " + warrior.a());
        System.out.println("XWarrior : " + xWarrior.a());
        System.out.println("Y1Warrior : " + y1Warrior.a());
        System.out.println("Y2Warrior : " + y2Warrior.b());
    }

    private static void runObserverPattern() {
        ClickEvent clickEvent = new ClickEvent();
        KeyboardEvent keyboardEvent = new KeyboardEvent();

        Subject subject = new Subject();
        subject.register(clickEvent);
        subject.register(keyboardEvent);
        subject.notify("Hello");
        subject.unRegister(clickEvent);
        subject.notify("Hello 2");
    }

    private static void runChainOfResponsibilityPattern() {
        RequestHandler a = new ARequestHandler();
        RequestHandler b = new BRequestHandler();
        a.setNext(b);
        a.process("A");
        a.process("B");
    }

    private static void runSingletonPattern() {
        Singleton singleton1 = Singleton.create("emre");
        Singleton singleton2 = Singleton.create("emre-2");
        System.out.println(singleton1.getName());
        System.out.println(singleton2.getName());
    }

    private static void runAdapterPattern() {
        DBConnection dbConnection = new DBConnection();
        dbConnection.run();
    }

    private static void runFacadePattern() {
        AtmFacade atmFacade = new AtmFacade();
        atmFacade.withdraw("pin", 1000);
    }
}
