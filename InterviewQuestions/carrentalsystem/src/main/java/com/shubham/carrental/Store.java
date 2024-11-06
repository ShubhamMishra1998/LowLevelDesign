package com.shubham.carrental;


import com.shubham.carrental.inventory.VehicleInventoryManager;
import com.shubham.carrental.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int id;
    Location location;
    VehicleInventoryManager vehicleInventoryManager;
    List<Reservation> reservationList = new ArrayList<>();



    public List<Vehicle> getVehicles() {
        return vehicleInventoryManager.getVehicles();
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public VehicleInventoryManager getVehicleInventoryManager() {
        return vehicleInventoryManager;
    }

    public void setVehicleInventoryManager(VehicleInventoryManager vehicleInventoryManager) {
        this.vehicleInventoryManager = vehicleInventoryManager;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
