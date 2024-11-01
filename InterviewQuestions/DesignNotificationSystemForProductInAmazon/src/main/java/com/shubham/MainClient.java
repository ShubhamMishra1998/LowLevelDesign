package com.shubham;

import com.shubham.observable.IPhoneStockObservable;
import com.shubham.observable.StocksObservable;
import com.shubham.observers.EmailNotificationAlertObserver;
import com.shubham.observers.NotificationAlertObserver;
import com.shubham.observers.PhoneNotificationAlertObserver;

import java.util.ArrayList;

public class MainClient {
    public static void main(String[] args) {
        StocksObservable iPhoneObservable = new IPhoneStockObservable(0, new ArrayList<>());

        NotificationAlertObserver emailAlert = new EmailNotificationAlertObserver(iPhoneObservable, "abcd@email.com");
        NotificationAlertObserver phoneAlert = new PhoneNotificationAlertObserver(iPhoneObservable, "1234567890");

        iPhoneObservable.updateStockCount(10);
    }
}
