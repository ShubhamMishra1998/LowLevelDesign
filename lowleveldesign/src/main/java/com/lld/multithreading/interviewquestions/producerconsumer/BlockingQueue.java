package com.lld.multithreading.interviewquestions.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> q1;
    private final int size;
    private final Object lock;

    public BlockingQueue(int size) {
        q1 =  new LinkedList<>();
        this.size = size;
        lock = new Object();
    }

    public boolean add(int value) {
        synchronized(lock) {
            while (q1.size() == size) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            q1.add(value);
            lock.notifyAll();
            return true;
        }
    }

    public int remove() {
        synchronized(lock) {
            while(q1.isEmpty()) {
                try {
                    lock.wait();
                } catch (InterruptedException e)  {
                    e.printStackTrace();
                }
            }
            int value = q1.poll();
            lock.notifyAll();
            return value;
        }
    }

}
