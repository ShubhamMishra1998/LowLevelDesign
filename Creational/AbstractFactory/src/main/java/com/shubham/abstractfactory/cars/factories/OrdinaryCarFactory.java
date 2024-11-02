package com.shubham.abstractfactory.cars.factories;

import com.shubham.abstractfactory.cars.Car;
import com.shubham.abstractfactory.cars.ordinary.Hyundai;
import com.shubham.abstractfactory.cars.ordinary.Mahindra;
import com.shubham.abstractfactory.cars.ordinary.Maruti;

public class OrdinaryCarFactory extends CarFactory {
    @Override
    public Car getCar(String whichCar) {
        return getCarFromType(whichCar);
    }


    private Car getCarFromType(String whichCar) {
        if (whichCar.equalsIgnoreCase("Mahindra")) {
            return new Mahindra();
        } else if (whichCar.equalsIgnoreCase("Maruti")) {
            return new Maruti();
        } else if (whichCar.equalsIgnoreCase("Hyundai")) {
            return new Hyundai();
        }
        return null;
    }
}
