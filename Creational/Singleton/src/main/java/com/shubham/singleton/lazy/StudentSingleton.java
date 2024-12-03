package com.shubham.singleton.lazy;

public class StudentSingleton {

    private static StudentSingleton instance;

    private StudentSingleton() {

    }

    public static StudentSingleton getInstance() {
        if (instance == null) {
            instance = new StudentSingleton();
        }
        return instance;
    }
}
