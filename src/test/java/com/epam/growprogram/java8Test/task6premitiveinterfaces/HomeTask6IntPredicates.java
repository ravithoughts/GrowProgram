package com.epam.growprogram.java8Test.task6premitiveinterfaces;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HomeTask6IntPredicates {

    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 20);
        List<Integer> primes = stream.filter(HomeTask6IntPredicates::isPrime)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(primes);
    }

    public static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }
}