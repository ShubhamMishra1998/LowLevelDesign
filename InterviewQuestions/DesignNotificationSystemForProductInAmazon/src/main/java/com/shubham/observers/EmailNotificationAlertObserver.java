package com.shubham.observers;

import com.shubham.observable.StocksObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver {

    private StocksObservable stocksObservable;
    private String emailId;

    public EmailNotificationAlertObserver(StocksObservable stocksObservable, String emailId) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
        stocksObservable.add(this);
    }


    @Override
    public void update() {
        System.out.println("Email sent to " + emailId + " since new stocks arrived");
    }
}
