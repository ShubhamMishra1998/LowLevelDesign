package com.shubham.nullobject.factory;

import com.shubham.nullobject.entity.Car;
import com.shubham.nullobject.entity.DefaultVehicle;
import com.shubham.nullobject.entity.Vehicle;

public class VehicleFactory {

    public Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        }
        return new DefaultVehicle();
    }
}
