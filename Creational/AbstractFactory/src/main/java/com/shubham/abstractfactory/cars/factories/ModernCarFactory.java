package com.shubham.abstractfactory.cars.factories;

import com.shubham.abstractfactory.cars.Car;
import com.shubham.abstractfactory.cars.modern.BMW;
import com.shubham.abstractfactory.cars.modern.Mercedes;

public class ModernCarFactory extends CarFactory {
    @Override
    public Car getCar(String whichCar) {
        return getCarFromType(whichCar);
    }

    private Car getCarFromType(String whichCar) {
        if (whichCar.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (whichCar.equalsIgnoreCase("Mercedes")) {
            return new Mercedes();
        }
        return null;
    }
}
