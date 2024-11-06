package com.shubham.carrental;

import com.shubham.carrental.vehicle.Vehicle;

import java.time.LocalDate;

public class Reservation {

    private int reservationId;
    private User user;
    private Vehicle  vehicle;
    private LocalDate bookedFrom;
    private LocalDate bookedTill;
    private Location from;
    private Location to;
    private int days;
    private int totalPrice;
    private ReservationStatus reservationStatus;
    private ReservationType reservationType;
    private Location location;


    public int reserve(Vehicle vehicle, User user) {
        this.user = user;
        this.vehicle = vehicle;
        this.reservationId = 9922;
        return reservationId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Location getFrom() {
        return from;
    }

    public void setFrom(Location from) {
        this.from = from;
    }

    public Location getTo() {
        return to;
    }

    public void setTo(Location to) {
        this.to = to;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(LocalDate bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public LocalDate getBookedTill() {
        return bookedTill;
    }

    public void setBookedTill(LocalDate bookedTill) {
        this.bookedTill = bookedTill;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
