package com.shubham.observers;

import com.shubham.observable.StocksObservable;

public class PhoneNotificationAlertObserver implements NotificationAlertObserver {

    private StocksObservable stocksObservable;
    private String phoneNumber;

    public PhoneNotificationAlertObserver(StocksObservable stocksObservable, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.stocksObservable = stocksObservable;
        stocksObservable.add(this);
    }


    @Override
    public void update() {
        System.out.println("Txt message sent to " + phoneNumber + " since new stocks arrived");
    }
}
