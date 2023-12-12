package com.epam.growprogram.java8Test.task6premitiveinterfaces;

import java.util.function.IntConsumer;

public class HomeTask6IntConsumerSquare {

    public static void main(String[] args) {
        IntConsumer printSquare = x -> System.out.println("Square of specified value: " + x * x);
        printSquare.accept(5);
        printSquare.accept(10);
    }
}