package com.shubham.observers;

import com.shubham.publisher.DefaultWeatherData;

public class CurrentConditionsDisplay implements Observer, Display {

    private final DefaultWeatherData weatherData;
    private int pressure;
    private int temperature;
    private int humidityIndex;

    public CurrentConditionsDisplay(DefaultWeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions Display " + "Pressure = " + getPressure() + " Temperature = " + getTemperature() + " Humidity =" + getHumidityIndex());
    }

    @Override
    public void update() {
        setPressure(weatherData.getPressure());
        setTemperature(weatherData.getTemperature());
        setHumidityIndex(weatherData.getHumidityIndex());
        display();
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidityIndex() {
        return humidityIndex;
    }

    public void setHumidityIndex(int humidityIndex) {
        this.humidityIndex = humidityIndex;
    }
}
