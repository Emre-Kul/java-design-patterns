package com.ek;

import com.ek.patterns.adapter.AdapterPatternRunner;
import com.ek.patterns.builder.BuilderPatternRunner;
import com.ek.patterns.chainofresponsibility.ChainOfResponsibilityPatternRunner;
import com.ek.patterns.composite.CompositePatternRunner;
import com.ek.patterns.decorator.DecoratorPatternRunner;
import com.ek.patterns.facade.FacadePatternRunner;
import com.ek.patterns.factory.FactoryPatternRunner;
import com.ek.patterns.iterator.IteratorPatternRunner;
import com.ek.patterns.observer.ObserverPatternRunner;
import com.ek.patterns.singleton.SingletonPatternRunner;
import com.ek.patterns.strategy.StrategyPatternRunner;
import com.ek.patterns.templatemethod.TemplateMethodPatternRunner;


public class Main {

    public static void main(String[] args) {
        StrategyPatternRunner.run();
        FactoryPatternRunner.run();
        DecoratorPatternRunner.run();
        ObserverPatternRunner.run();
        ChainOfResponsibilityPatternRunner.run();
        SingletonPatternRunner.run();
        AdapterPatternRunner.run();
        FacadePatternRunner.run();
        TemplateMethodPatternRunner.run();
        BuilderPatternRunner.run();
        IteratorPatternRunner.run();
        CompositePatternRunner.run();
    }

}
