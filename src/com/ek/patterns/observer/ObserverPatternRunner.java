package com.ek.patterns.observer;

public class ObserverPatternRunner {

    public static void run() {

        ClickEvent clickEvent = new ClickEvent();
        KeyboardEvent keyboardEvent = new KeyboardEvent();

        Subject subject = new Subject();
        subject.register(clickEvent);
        subject.register(keyboardEvent);
        subject.notify("Hello");
        subject.unRegister(clickEvent);
        subject.notify("Hello 2");
    }


}
