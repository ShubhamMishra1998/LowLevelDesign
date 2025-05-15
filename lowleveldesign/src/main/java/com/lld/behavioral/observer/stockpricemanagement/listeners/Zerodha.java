package com.lld.behavioral.observer.stockpricemanagement.listeners;

public class Zerodha implements MobileAppListener {
    @Override
    public void update(String stockName, double price) {
        System.out.println("Stock price of " + stockName + " Zerodha has changed to " + price);
    }
}
