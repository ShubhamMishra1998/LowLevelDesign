package com.shubham.publisher;

import com.shubham.observers.Observer;

public interface WeatherData {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
