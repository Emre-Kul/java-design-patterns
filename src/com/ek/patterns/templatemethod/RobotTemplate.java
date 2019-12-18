package com.ek.patterns.templatemethod;

public abstract class RobotTemplate {

    public void start() {
        System.out.println("Start base robot class");
    }

    public void getParts() {
        System.out.println("Get parts robot class");
    }

    public void assemble() {
        System.out.println("Assemble robot class");
    }

    public void test() {
        System.out.println("Test robot class");
    }

    public void stop() {
        System.out.println("Stop base robot class");
    }

    public final void go() {
        start();
        getParts();
        assemble();
        if(testOk()) {
            test();
        }
        stop();
    }

    public boolean testOk() {
        return true;
    }

}
