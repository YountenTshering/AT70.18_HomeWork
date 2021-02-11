package com.example.DesignPatterns.cor;

public class Baht1Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {

        this.chain = nextChain;

    }

    @Override
    public void dispense(Currency cur) {

        if (cur.getAmount() >= 1) {
            int num = cur.getAmount() / 1;
            int remainder = cur.getAmount() % 1;
            System.out.println("Dispensing " + num + " 1 baht coin(s)");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        }
    }

}