package com.lld.solid.ocp;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying cash...");
    }
}
