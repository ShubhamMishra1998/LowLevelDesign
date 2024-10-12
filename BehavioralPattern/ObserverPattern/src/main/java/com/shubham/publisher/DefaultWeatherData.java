package com.shubham.publisher;

import com.shubham.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class DefaultWeatherData implements WeatherData {

    private final List<Observer> observers;

    private int pressure;
    private int temperature;
    private int humidityIndex;

    public DefaultWeatherData() {
        this.observers = new ArrayList<>();
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    public void setMeasurements(int pressure, int temperature, int humidityIndex) {
        setPressure(pressure);
        setTemperature(temperature);
        setHumidityIndex(humidityIndex);
        isMeasurementsChanged();
    }

    public void isMeasurementsChanged() {
        notifyObserver();
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidityIndex() {
        return humidityIndex;
    }

    public void setHumidityIndex(int humidityIndex) {
        this.humidityIndex = humidityIndex;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
