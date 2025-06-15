package com.lld.interviewproblems.carrental.vehicle;

import com.lld.interviewproblems.carrental.enums.VehicleType;

public class TravellerVehicle extends Vehicle {
    private static final int RATE_MULTIPLIER = 3;

    public TravellerVehicle(String registrationNumber, VehicleType vehicleType, int rentedPrice) {
        super(registrationNumber, vehicleType, rentedPrice);
    }


    @Override
    public int calculateRentedPrice(int days) {
        return getRentedPrice() * days * RATE_MULTIPLIER;
    }
}
