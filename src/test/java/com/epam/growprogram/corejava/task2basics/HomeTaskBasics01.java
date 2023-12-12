package com.epam.growprogram.corejava.task2basics;

public class HomeTaskBasics01 {

    public static void main(String [] args) {

        // Read Input name from Command Line
        for (String arg : args) {
            System.out.println("Hello " + arg);
        }
    }
}