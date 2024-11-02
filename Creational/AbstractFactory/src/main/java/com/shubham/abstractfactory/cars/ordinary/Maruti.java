package com.shubham.abstractfactory.cars.ordinary;

import com.shubham.abstractfactory.cars.Car;

public class Maruti implements Car {
    @Override
    public void printCarType() {
        System.out.println("This is a ordinary Maruti");
    }
}
