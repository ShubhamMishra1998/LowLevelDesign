package com.shubham.abstractfactory.cars.ordinary;

import com.shubham.abstractfactory.cars.Car;

public class Mahindra implements Car {
    @Override
    public void printCarType() {
        System.out.println("This is a ordinary Mahindra");
    }
}
