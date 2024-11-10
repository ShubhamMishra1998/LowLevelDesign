package com.shubham.proxy;

public class Proxy implements Subject {

    private final Subject realSubject;

    public Proxy() {
        realSubject = new RealSubject();
    }
    @Override
    public void addRowToDB(String row) {
        if(hasAccessToDB()) {
            realSubject.addRowToDB(row);
        } else {
            throw new RuntimeException("No access to DB");
        }
    }


    private boolean hasAccessToDB() {
        return true;
    }

}
