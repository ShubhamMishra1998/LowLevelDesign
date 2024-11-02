package com.shubham.abstractfactory.cars.modern;

import com.shubham.abstractfactory.cars.Car;

public class BMW implements Car {
    @Override
    public void printCarType() {
        System.out.println("This is a modern BMW");
    }
}
