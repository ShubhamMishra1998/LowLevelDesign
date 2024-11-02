package com.shubham.abstractfactory.cars.modern;

import com.shubham.abstractfactory.cars.Car;

public class Mercedes implements Car {
    @Override
    public void printCarType() {
        System.out.println("This is a modern Mercedes");
    }
}
