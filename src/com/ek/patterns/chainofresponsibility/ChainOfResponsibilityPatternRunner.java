package com.ek.patterns.chainofresponsibility;

import com.ek.patterns.iterator.Basket;
import com.ek.patterns.iterator.BasketIterator;
import com.ek.patterns.iterator.Item;

public class ChainOfResponsibilityPatternRunner {

    public static void run() {
        RequestHandler a = new ARequestHandler();
        RequestHandler b = new BRequestHandler();
        a.setNext(b);
        a.process("A");
        a.process("B");
    }

}
