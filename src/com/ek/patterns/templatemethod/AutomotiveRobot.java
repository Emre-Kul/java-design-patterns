package com.ek.patterns.templatemethod;

public class AutomotiveRobot extends RobotTemplate {

    @Override
    public void start() {
        System.out.println("Start Automotive Robot!");
    }

    @Override
    public void stop() {
        System.out.println("Stop Automotive Robot!");
    }

}
