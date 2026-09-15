package com.decodewithpriyo.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== 07: Multithreading & Collections ===");
        
        // Thread creation using Runnable Lambda
        Thread t1 = new Thread(() -> {
            System.out.println("Worker thread running: " + Thread.currentThread().getName());
        });
        t1.start();
        t1.join();
        
        // Collections: List, Set, Map
        List<String> list = new ArrayList<>(List.of("Java", "Spring", "Docker"));
        Set<Integer> uniqueNums = new HashSet<>(List.of(1, 2, 2, 3));
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Priyo", 100);
        
        System.out.println("List: " + list);
        System.out.println("Set (Unique): " + uniqueNums);
        System.out.println("Map: " + scores);
    }
}
