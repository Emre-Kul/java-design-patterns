package com.ek.patterns.facade;

public class AtmFacade {

    private Atm atm;

    public AtmFacade() {
        this.atm = new Atm();
    }

    public void withdrawal(String pin, int amount) {
        this.atm.login(pin);
        this.atm.setAmount(amount);
        this.atm.checkAmountIsOk();
        this.atm.withdrawal();
        this.atm.logout();
    }
}
