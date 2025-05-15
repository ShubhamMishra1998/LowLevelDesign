package com.lld.behavioral.observer.stockpricemanagement.listeners;

public class Grow implements MobileAppListener{
    @Override
    public void update(String stockName, double price) {
        System.out.println("Stock price of " + stockName + " Grow has changed to " + price);
    }
}
