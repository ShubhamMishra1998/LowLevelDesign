package com.lld.interviewproblems.carrental.entities;

import com.lld.interviewproblems.carrental.vehicle.Vehicle;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ReservationManager {
    private Map<Integer, Reservation> reservations;
    private int nextReservationId;

    public ReservationManager() {
        this.reservations = new HashMap<>();
        this.nextReservationId = 1;
    }

    public Reservation createReservation(User user, Vehicle vehicle,
                                         RentalStore pickupStore, RentalStore returnStore, Date startDate,
                                         Date endDate) {
        Reservation reservation = new Reservation(nextReservationId++, user,
                vehicle, pickupStore, returnStore, startDate, endDate);
        reservations.put(reservation.getId(), reservation);
        user.setReservation(reservation);
        return reservation;
    }

    public void confirmReservation(int reservationId) {
        Reservation reservation = reservations.get(reservationId);
        if (reservation != null) {
            reservation.confirmReservation();
        }
    }

    public void startRental(int reservationId) {
        Reservation reservation = reservations.get(reservationId);
        if (reservation != null) {
            reservation.startRental();
        }
    }

    public void completeRental(int reservationId) {
        Reservation reservation = reservations.get(reservationId);
        if (reservation != null) {
            reservation.completeRental();
        }
    }

    public void cancelReservation(int reservationId) {
        Reservation reservation = reservations.get(reservationId);
        if (reservation != null) {
            reservation.cancelReservation();
        }
    }

    public Reservation getReservation(int reservationId) {
        return reservations.get(reservationId);
    }

    public Map<Integer, Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Map<Integer, Reservation> reservations) {
        this.reservations = reservations;
    }

    public int getNextReservationId() {
        return nextReservationId;
    }

    public void setNextReservationId(int nextReservationId) {
        this.nextReservationId = nextReservationId;
    }
}
