package com.example.design.model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> hashMap = new ConcurrentHashMap<>();
        Lock lock = new ReentrantLock();

        // Thread 1
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put(i, "Value " + i);
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                hashMap.put(i, "Value " + i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Size of HashMap: " + hashMap.size());
    }
}
