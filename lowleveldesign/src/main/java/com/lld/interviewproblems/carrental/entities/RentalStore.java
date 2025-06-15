package com.lld.interviewproblems.carrental.entities;

import com.lld.interviewproblems.carrental.enums.VehicleStatus;
import com.lld.interviewproblems.carrental.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class RentalStore {
    private int id;
    private String name;
    private Map<String, Vehicle> vehicles;
    private Location location;

    public RentalStore(int id, String name, Map<String, Vehicle> vehicles, Location location) {
        this.id = id;
        this.name = name;
        this.vehicles = vehicles;
        this.location = location;
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        vehicles.forEach((k,v) -> {
            if(v.getStatus() == VehicleStatus.AVAILABLE) {
                availableVehicles.add(v);
            }
        });
        return availableVehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getRegistrationNumber(), vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle.getRegistrationNumber());
    }

    public boolean isVehicleAvailable(String registrationNumber, Date startDate, Date endDate) {
        Vehicle vehicle = vehicles.get(registrationNumber);
        return vehicle != null
                && vehicle.getStatus() == VehicleStatus.AVAILABLE;
    }

    public Vehicle getVehicle(String registrationNumber) {
        return vehicles.get(registrationNumber);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Map<String, Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
