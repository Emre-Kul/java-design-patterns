package com.ek.patterns.facade;

public class FacadePatternRunner {

    public static void run() {
        AtmFacade atmFacade = new AtmFacade();
        atmFacade.withdrawal("pin", 1000);
    }

}
