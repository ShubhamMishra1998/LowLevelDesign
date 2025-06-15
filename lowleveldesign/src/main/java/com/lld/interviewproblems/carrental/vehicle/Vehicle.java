package com.lld.interviewproblems.carrental.vehicle;

import com.lld.interviewproblems.carrental.enums.VehicleStatus;
import com.lld.interviewproblems.carrental.enums.VehicleType;

public abstract class Vehicle {
    private String registrationNumber;
    private VehicleStatus status;
    private VehicleType vehicleType;
    private int rentedPrice;

    public Vehicle(String registrationNumber, VehicleType vehicleType, int rentedPrice) {
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
        this.rentedPrice = rentedPrice;
        this.status = VehicleStatus.AVAILABLE;
    }

    public abstract int calculateRentedPrice(int days);

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getRentedPrice() {
        return rentedPrice;
    }

    public void setRentedPrice(int rentedPrice) {
        this.rentedPrice = rentedPrice;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
