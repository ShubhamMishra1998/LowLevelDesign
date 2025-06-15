package com.lld.interviewproblems.carrental.payment;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(int amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}
