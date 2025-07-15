package com.lld.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "hello";
        });

        CompletableFuture<Void> cf1 = stringCompletableFuture.thenAccept(x-> {
            System.out.println(x+" world");
        });

        cf1.get();
    }
}
