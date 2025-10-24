package com.lld.creational.singleton;

public class LazyInitializationThreadSafe {

    private volatile static LazyInitializationThreadSafe instance;

    private LazyInitializationThreadSafe() {

    }

    public static LazyInitializationThreadSafe getInstance() {

        if(instance == null) {
            synchronized (LazyInitializationThreadSafe.class) {
                if(instance == null) {
                    instance = new LazyInitializationThreadSafe();
                }
                return instance;
            }
        }
        return instance;
    }
}
