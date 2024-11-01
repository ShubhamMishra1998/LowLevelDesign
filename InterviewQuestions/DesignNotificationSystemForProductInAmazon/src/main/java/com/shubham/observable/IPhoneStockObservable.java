package com.shubham.observable;

import com.shubham.observers.NotificationAlertObserver;

import java.util.List;

public class IPhoneStockObservable implements StocksObservable {

    private int stockCount;
    private final List<NotificationAlertObserver> observers;

    public IPhoneStockObservable(int stockCount, List<NotificationAlertObserver> observers) {
        this.stockCount = stockCount;
        this.observers = observers;
    }


    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public boolean isStockAvailable() {
        return stockCount > 0;
    }

    public int getStockCount() {
        return stockCount;
    }
    @Override
    public void updateStockCount(int updatedStockCount) {
        if (this.stockCount == 0) {
            notifyObservers();
        }
        this.stockCount += updatedStockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }
}
