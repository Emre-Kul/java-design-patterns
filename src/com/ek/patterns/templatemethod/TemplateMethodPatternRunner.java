package com.ek.patterns.templatemethod;

public class TemplateMethodPatternRunner {

    public static void run() {
        RobotTemplate rt = new AutomotiveRobot();
        rt.go();
        rt = new CookieRobot();
        rt.go();
    }

}
