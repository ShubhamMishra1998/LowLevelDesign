package com.lld.behavioral.observer.stockpricemanagement.publisher;

import com.lld.behavioral.observer.stockpricemanagement.listeners.StockListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockManager {
    private final Map<String, List<StockListener>> listeners;

    public StockManager(String... stockNames) {
        listeners = new HashMap<>();
        for (String stockName : stockNames) {
            listeners.put(stockName, new ArrayList<>());
        }
    }

    public void subscribe(String stockName, StockListener listener) {
        listeners.get(stockName).add(listener);
    }

    public void unsubscribe(String stockName, StockListener listener) {
        listeners.get(stockName).remove(listener);
    }

    public void notify(String stockName, double price) {
        listeners.get(stockName).forEach(listener -> listener.update(stockName, price));
    }
}
