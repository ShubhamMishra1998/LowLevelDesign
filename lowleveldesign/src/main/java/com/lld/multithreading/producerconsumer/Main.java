package com.lld.multithreading.producerconsumer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Producer Thrread");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.consume();
                } catch (InterruptedException e) {
                      e.printStackTrace();
                }
            }
        }, " Consumer Thread");


        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

}
