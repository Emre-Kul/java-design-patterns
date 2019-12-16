package com.ek.patterns.facade;

public class Atm {

    private String pin;
    private int amount;

    public Atm() {
        this.pin = "";
        this.amount = 0;
    }

    public void login(String pin) {
        // checks etc
        this.pin = pin;
        System.out.println("Login with : " + this.pin);
    }
    public void setAmount(int amount) {
        // checks etc
        this.amount = amount;
        System.out.println("Set Amount To : " + this.amount);
    }

    public boolean checkAmountIsOk() {
        // checks etc
        System.out.println("Check Amount Is Ok");
        return true;
    }

    public void withdraw() {
        System.out.println("Withdraw");
    }

    public void logout() {
        System.out.println("Logout");
        this.pin = "";
        this.amount = 0;
    }

}
