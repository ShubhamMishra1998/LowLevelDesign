package com.shubham.carrental.inventory;

import com.shubham.carrental.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class VehicleInventoryManager {

    List<Vehicle> vehicles = new ArrayList<>();


    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
