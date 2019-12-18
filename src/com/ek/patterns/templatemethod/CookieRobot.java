package com.ek.patterns.templatemethod;

public class CookieRobot extends RobotTemplate {

    @Override
    public void getParts() {
        System.out.println("Get parts Cookie Robot class");
    }

    @Override
    public void assemble() {
        System.out.println("Assemble Cookie Robot class");
    }

    @Override
    public boolean testOk() {
        return false;
    }
}
