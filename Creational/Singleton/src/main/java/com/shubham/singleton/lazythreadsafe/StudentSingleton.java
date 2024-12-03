package com.shubham.singleton.lazythreadsafe;

public class StudentSingleton {

    private static volatile StudentSingleton instance;
    private StudentSingleton() {

    }

    public static synchronized StudentSingleton getInstance() {
        if (instance == null) {

            synchronized (StudentSingleton.class) {
                if (instance == null) {
                    instance = new StudentSingleton();
                }
            }
        }
        return instance;
    }
}
