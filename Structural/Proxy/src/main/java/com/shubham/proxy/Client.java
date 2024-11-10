package com.shubham.proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.addRowToDB("hello");
    }
}
