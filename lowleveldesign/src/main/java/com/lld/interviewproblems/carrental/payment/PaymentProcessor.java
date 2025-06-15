package com.lld.interviewproblems.carrental.payment;

public class PaymentProcessor {
    public boolean processPayment(int amount, PaymentStrategy paymentStrategy) {
        paymentStrategy.processPayment(amount);
        return true; // Assume payment is successful for simplicity
    }

}
