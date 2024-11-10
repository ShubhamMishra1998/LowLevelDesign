package com.shubham.proxy;

public class RealSubject implements Subject {
    @Override
    public void addRowToDB(String row) {
        System.out.println("Data "+row+" added to DB");
    }
}
