package com.epam.growprogram.java8Test.task6premitiveinterfaces;

import java.util.Random;
import java.util.function.IntSupplier;

public class HomeTask6IntSupplierRandom {

    public static void main(String[] args) {
        IntSupplier getRandom = () -> new Random().nextInt(5000);
        System.out.println("Random number 1 = " + getRandom.getAsInt());
        System.out.println("Random number 2 = " + getRandom.getAsInt());
    }
}