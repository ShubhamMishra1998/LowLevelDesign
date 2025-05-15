package com.lld.solid.ocp;

public class GooglePayPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying through Google Pay...");
    }
}
