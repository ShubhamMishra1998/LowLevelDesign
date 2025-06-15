package com.lld.multithreading.createthread.calllable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        MyCallable callable1 = new MyCallable("callable1");
        MyCallable callable2 = new MyCallable("callable2");

        try {
            Future<String> future1 = executorService.submit(callable1);
            Future<String> future2 = executorService.submit(callable2);

            System.out.println("Results from first callable: ");
            System.out.println(future1.get());

            System.out.println("Results from second callable: ");
            System.out.println(future2.get());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
