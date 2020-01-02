package com.ek.patterns.composite;

public class CompositePatternRunner {

    public static void run() {
        CompanyDirectory cp1 = new CompanyDirectory();
        CompanyDirectory cp2 = new CompanyDirectory();

        cp1.add(new Manager("Manager-1"));
        cp2.add(new Manager("Manager-2"));
        cp1.add(new Developer("Developer", 1));
        cp2.add(new Developer("Developer", 2));

        cp1.add(cp2);

        System.out.println("----------------Company-Directory-1---------------------");
        cp1.printStatus();
        System.out.println("----------------Company-Directory-2---------------------");
        cp2.printStatus();
    }

}
