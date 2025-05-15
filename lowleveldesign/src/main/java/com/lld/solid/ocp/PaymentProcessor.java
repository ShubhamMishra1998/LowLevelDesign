package com.lld.solid.ocp;

/**
 * This class violates OCP as when new payment methods are added, we need to modify this class.
 */
public class PaymentProcessor {
    public void processPayment(String paymentType) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing payment through Credit Card...");
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing payment through PayPal...");
        } else if (paymentType.equals("BankTransfer")) {
            System.out.println("Processing payment through Bank Transfer...");
        } else {
            throw new IllegalArgumentException("Unsupported payment type");
        }
    }

}
