package com.mycompany.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(10);
        
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executor.submit(() -> System.out.println("Running task " + index));
        }
        System.out.println("Task started...");
        executor.shutdown();
    }
}
