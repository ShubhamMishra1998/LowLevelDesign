package com.shubham.observable;

import com.shubham.observers.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);

    void notifyObservers();

    boolean isStockAvailable();

    public void updateStockCount(int stockCount);
}
