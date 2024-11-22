package com.shubham.nullobject;

import com.shubham.nullobject.entity.Vehicle;
import com.shubham.nullobject.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("car");
        System.out.println(vehicle.getName());
    }
}
