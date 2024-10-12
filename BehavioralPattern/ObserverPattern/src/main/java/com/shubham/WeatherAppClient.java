package com.shubham;

import com.shubham.observers.CurrentConditionsDisplay;
import com.shubham.observers.Observer;
import com.shubham.observers.WeatherForecastDisplay;
import com.shubham.publisher.DefaultWeatherData;

public class WeatherAppClient {
    public static void main(String[] args) {
        DefaultWeatherData weatherData = new DefaultWeatherData();

        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        Observer weatherForecastDisplay = new WeatherForecastDisplay(weatherData);

        weatherData.setMeasurements(10, 20, 30);
        weatherData.setMeasurements(50,60,70);
        weatherData.setMeasurements(90,100,200);
    }
}
