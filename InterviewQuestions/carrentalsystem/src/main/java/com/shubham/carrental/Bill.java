package com.shubham.carrental;

public class Bill {
    int id;
    Reservation reservation;
    int totalPrice;
    boolean isBillPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.totalPrice = calculateTotalPrice();
        this.isBillPaid = false;

    }

    private int calculateTotalPrice() {
        return 90;
    }

}
