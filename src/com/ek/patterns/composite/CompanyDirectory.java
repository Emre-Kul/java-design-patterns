package com.ek.patterns.composite;

import java.util.ArrayList;

public class CompanyDirectory implements Employee {

    private ArrayList<Employee> emps;

    public CompanyDirectory() {
        this.emps = new ArrayList<>();
    }

    public void add(Employee emp) {
        this.emps.add(emp);
    }

    @Override
    public void printStatus() {
        for(Employee emp: emps) {
            emp.printStatus();
        }
    }
}
