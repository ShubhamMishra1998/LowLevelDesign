package com.shubham.carrental;

public class User {

    int id;
    int drivingLicense;
    String name;
    String email;
    String phoneNumber;
    String password;

    public User(int id, int drivingLicense, String name, String email, String phoneNumber, String password) {
        this.id = id;
        this.drivingLicense = drivingLicense;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
