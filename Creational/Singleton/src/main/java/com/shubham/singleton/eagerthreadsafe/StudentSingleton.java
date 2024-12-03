package com.shubham.singleton.eagerthreadsafe;

public class StudentSingleton {

    private static StudentSingleton instance = new StudentSingleton();

    private StudentSingleton() {

    }

    public static synchronized StudentSingleton getInstance() {
        return instance;
    }
}
