package com.shubham.abstractfactory.cars.factories;

import com.shubham.abstractfactory.cars.Car;

public abstract class CarFactory {
    Car car;

    public abstract Car getCar(String whichCar);

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
