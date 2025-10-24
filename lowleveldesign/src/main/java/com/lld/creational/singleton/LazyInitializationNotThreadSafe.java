package com.lld.creational.singleton;

public class LazyInitializationNotThreadSafe {

    private static final LazyInitializationNotThreadSafe instance = null;

    private LazyInitializationNotThreadSafe() {

    }

    public static LazyInitializationNotThreadSafe getInstance() {
        if(instance == null) {
            return new LazyInitializationNotThreadSafe();
        }
        return instance;
    }
}
