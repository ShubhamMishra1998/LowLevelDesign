package com.lld.behavioral.observer.stockpricemanagement.listeners;

public class CompanyA implements BrokerSystem{
    @Override
    public void update(String stockName, double price) {
        System.out.println("Stock price of " + stockName + "CompanyA has changed to " +  price);
    }
}
