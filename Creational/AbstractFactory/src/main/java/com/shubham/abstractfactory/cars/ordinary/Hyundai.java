package com.shubham.abstractfactory.cars.ordinary;

import com.shubham.abstractfactory.cars.Car;

public class Hyundai implements Car {
    @Override
    public void printCarType() {
        System.out.println("This is a ordinary Hyundai");
    }
}
