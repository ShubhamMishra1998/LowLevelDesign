package com.lld.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private final Queue<Integer> buffer;
    private final int MAX_CAPACITY = 5;

    public ProducerConsumer() {
        this.buffer = new LinkedList<>();
    }

    public void produce() throws InterruptedException {
        int value = 0;
        while(true) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " is trying to produce the value");
                while (buffer.size() == MAX_CAPACITY) {
                    System.out.println(Thread.currentThread().getName() + " is in a waiting state.");
                    wait();
                }
                System.out.println(Thread.currentThread().getName() + " is produce a value " + value);
                buffer.offer(value++);
                notifyAll();
            }
            Thread.sleep(1000);
        }
    }

    public void consume() throws InterruptedException{
        while (true) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " is trying to consume a value");
                while (buffer.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + " is in a waitinig state");
                    wait();
                }
                int value = buffer.poll();
                System.out.println(Thread.currentThread().getName() + " is consumed " + value);
                notifyAll();
            }
            Thread.sleep(1000);
        }
    }
}
