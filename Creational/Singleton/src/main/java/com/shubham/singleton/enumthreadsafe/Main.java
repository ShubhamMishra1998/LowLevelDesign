package com.shubham.singleton.enumthreadsafe;

public class Main {
    public static void main(String[] args) {
        StudentSingleton studentSingleton1 = StudentSingleton.INSTANCE;
        System.out.println(studentSingleton1.hashCode());

        StudentSingleton studentSingleton2 = StudentSingleton.INSTANCE;
        System.out.println(studentSingleton2.hashCode());
    }
}
