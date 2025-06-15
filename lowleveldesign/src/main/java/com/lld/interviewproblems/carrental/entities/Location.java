package com.lld.interviewproblems.carrental.entities;

public class Location {
    private String city;
    private String zipCode;
    private String state;
    private String address;

    public Location(String city, String zipCode, String state, String address) {
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
