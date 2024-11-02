package com.shubham.abstractfactory.cars;

import com.shubham.abstractfactory.cars.factories.CarFactory;
import com.shubham.abstractfactory.cars.factories.CarTypeFactory;
import com.shubham.abstractfactory.cars.factories.DefaultCarTypeFactory;

public class Main {
    public static void main(String[] args) {
        CarTypeFactory carTypeFactory = new DefaultCarTypeFactory();
        CarFactory carFactory = carTypeFactory.getCarFactory("modern");
        Car car = carFactory.getCar("BMW");
        car.printCarType();

        carFactory = carTypeFactory.getCarFactory("ordinary");
        car = carFactory.getCar("mahindra");
        car.printCarType();


    }
}
