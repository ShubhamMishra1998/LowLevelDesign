package com.lld.behavioral.observer.stockpricemanagement;

import com.lld.behavioral.observer.stockpricemanagement.listeners.CompanyA;
import com.lld.behavioral.observer.stockpricemanagement.listeners.Grow;
import com.lld.behavioral.observer.stockpricemanagement.listeners.Zerodha;
import com.lld.behavioral.observer.stockpricemanagement.stock.Stock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.getManager().subscribe("Amazon", new Zerodha());
        stock.getManager().subscribe("Flipkart", new Grow());
        stock.getManager().subscribe("Microsoft", new CompanyA());
        stock.getManager().subscribe("Flipkart", new Zerodha());
        stock.setPrice("Flipkart", 100);

    }
}
