package com.lld.multithreading.synchronization.volatileexample;

public class Main {
    public static void main(String[] args) {
        VolatileFlagExample  volatileFlagExample = new VolatileFlagExample();

        Thread thread = new Thread(volatileFlagExample);
        thread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        volatileFlagExample.setFlag(false);

        System.out.println(volatileFlagExample.getCounter());
    }
}
