package com.lld.solid.ocp;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying by card...");
    }
}
