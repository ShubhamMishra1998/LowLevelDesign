package com.lld.multithreading.interviewquestions.producerconsumer;

public class Main {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue(5);

        Runnable addRunnable =  () -> {
            int x = 0;
            while (true) {
                blockingQueue.add(x);
                System.out.println(x + " value added to the queue");
                x++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable reemoveRunnable =  () -> {
            while (true) {
                int x = blockingQueue.remove();
                System.out.println(x + " value removed to the queue");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread producer = new Thread(addRunnable, "producer");
        Thread consumer = new Thread(reemoveRunnable, "consumer");

        producer.start();
        consumer.start();
    }
}
