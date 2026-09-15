package com.decodewithpriyo.streams;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 08: Stream API & Optional ===");
        
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        
        // Filter even numbers, square them, and sum
        int sumOfSquaredEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
                
        System.out.println("Sum of Squared Evens: " + sumOfSquaredEvens);
        
        // Optional
        Optional<String> opt = Optional.ofNullable("DecodeWithPriyo");
        opt.ifPresent(val -> System.out.println("Optional Value: " + val));
    }
}
