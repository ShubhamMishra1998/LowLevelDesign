package com.lld.multithreading.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        int services = 3;

        CyclicBarrier barrier = new CyclicBarrier(services, ()-> System.out.println("All services reached the point of completion"));

        Thread webServer = new Thread(new DemoService(barrier, 1000), "web server");
        Thread dbServer = new Thread(new DemoService(barrier,5000), "db server");
        Thread cacheServer = new Thread(new DemoService(barrier, 2000), "cache server");

        webServer.start();
        dbServer.start();
        cacheServer.start();

        System.out.println("main thread started");
    }
}
