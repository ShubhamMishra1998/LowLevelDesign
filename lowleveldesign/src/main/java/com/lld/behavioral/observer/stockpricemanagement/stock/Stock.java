package com.lld.behavioral.observer.stockpricemanagement.stock;

import com.lld.behavioral.observer.stockpricemanagement.publisher.StockManager;

public class Stock {
    private final StockManager manager;
    private int price;

    public Stock() {
        manager = new StockManager("Amazon", "Flipkart", "Microsoft");
    }

    public void priceChange(String stockName) {
        manager.notify(stockName, price);
    }

    public void setPrice(String stockName, int price) {
        setPrice(price);
        priceChange(stockName);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public StockManager getManager() {
        return this.manager;
    }


}
