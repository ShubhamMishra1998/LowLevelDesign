package com.lld.multithreading.createthread.practice.callable;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        MyCallable myCallable1 = new MyCallable("MyCallable1");
        MyCallable myCallable2 = new MyCallable("MyCallable1");

        try(ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            Future<String> f1 = executorService.submit(myCallable1);
            Future<String> f2 = executorService.submit(myCallable2);
            System.out.println(f1.get());
            System.out.println(f2.get());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
