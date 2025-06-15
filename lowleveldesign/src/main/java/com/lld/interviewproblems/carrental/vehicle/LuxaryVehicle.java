package com.lld.interviewproblems.carrental.vehicle;

import com.lld.interviewproblems.carrental.enums.VehicleType;

public class LuxaryVehicle extends Vehicle {
    private static final int RATE_MULTIPLIER = 2;

    public LuxaryVehicle(String registrationNumber, VehicleType vehicleType, int rentedPrice) {
        super(registrationNumber, vehicleType, rentedPrice);
    }


    @Override
    public int calculateRentedPrice(int days) {
        return getRentedPrice() * days * RATE_MULTIPLIER;
    }
}
