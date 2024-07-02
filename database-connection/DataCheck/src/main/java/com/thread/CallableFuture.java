/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thread;

/**
 *
 * @author Donna
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 56; i++) {
                sum += i;
            }
            return sum;
        };
        // Create an ExecutorService with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Submit the task to the executor
        Future<Integer> future = executor.submit(task);
        
        // Wait for the task to complete and get the result
        int result = future.get();  
        
        System.out.println("Result: " + result);
        // Shutdown the executor
        executor.shutdown();
    }
}

