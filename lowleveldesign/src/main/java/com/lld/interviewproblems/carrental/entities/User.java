package com.lld.interviewproblems.carrental.entities;

public class User {
    private int id;
    private String userName;
    private String email;
    private Reservation reservation;

    public User(int id, String userName, String email, Reservation reservation) {
        this.id =  id;
        this.userName = userName;
        this.email = email;
        this.reservation = reservation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
