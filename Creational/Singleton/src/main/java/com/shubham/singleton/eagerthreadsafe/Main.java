package com.shubham.singleton.eagerthreadsafe;

public class Main {
    public static void main(String[] args) {
        StudentSingleton studentSingleton1 = StudentSingleton.getInstance();
        System.out.println(studentSingleton1.hashCode());

        StudentSingleton studentSingleton2 = StudentSingleton.getInstance();
        System.out.println(studentSingleton2.hashCode());
    }
}
