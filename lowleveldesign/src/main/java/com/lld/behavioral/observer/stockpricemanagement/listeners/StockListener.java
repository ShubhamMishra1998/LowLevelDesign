package com.lld.behavioral.observer.stockpricemanagement.listeners;

public interface StockListener {
    void update(String stockName, double price);
}
