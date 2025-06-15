package com.lld.interviewproblems.carrental.payment;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(int amount) {
        System.out.println("Processing card payment of $" + amount);
    }
}
