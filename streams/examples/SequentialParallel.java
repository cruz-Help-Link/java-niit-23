// Java program to understand execution 
// of sequential streams 

import java.io.*;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.*;

class SequentialParallel {

    public static void main(String[] args) {
        // create a list

        //A running nose is not functional
        String sent = "A running nose is not functional";
        String[] arr = sent.split(" ");
        for (String s : arr) {
          System.out.println(s);
        }
        //SPLIT WITH 'N'
        String[] arrN = sent.split("n");
        for (String s : arrN) {
          System.out.println(s);
        }

        List<String> listA = Arrays.asList(arr);
        listA.stream().forEach(System.out::print);
        System.out.println("\nParallel Stream");
        listA.parallelStream().forEach(System.out::print);

        List<String> listN = Arrays.asList(arrN);
        listN.stream().forEach(System.out::print);

        List<String> list = Arrays.asList("Just ","A ", "min ","ute", "please!");
        System.out.println();

        // stream() method is for sequential stream
        // Iterate and print each element of the stream
        System.out.println("\nSequential Stream: ");
        // list.stream().forEach(System.out::print);
        // parallelStream() method for parallel stream

        System.out.println("\nParallel Stream: ");

        // list.parallelStream().forEach(System.out::print);


        
        CompletableFuture<String> greetingFuture 
            = CompletableFuture.supplyAsync(() -> { 
                  // some async computation 
                  return "\nA minute from CompletableFuture"; 
              }); 
              try {
                System.out.println();
                System.out.println(greetingFuture.get()); 
                
              } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Exception");
              }

    }
}
