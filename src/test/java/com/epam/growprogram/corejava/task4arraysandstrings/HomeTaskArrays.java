package com.epam.growprogram.corejava.task4arraysandstrings;

import java.util.Scanner;

public class HomeTaskArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int numberSize = scanner.nextInt();
        int[] numbers = new int[numberSize];
        //numbers array
        for (int i = 0; i < numberSize; i++) {
            System.out.println("Enter the numbers");
            numbers[i] = scanner.nextInt();
        }

        int smallest = numbers[0];
        int biggest = numbers[0];
        try {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > biggest)
                    biggest = numbers[i];
                else if (numbers[i] < smallest)
                    smallest = numbers[i];
            }
        } catch (Exception exception) {
            System.out.println("Exception If any => " + exception.getMessage());
        }

        System.out.println("Biggest Number is : " + biggest);
        System.out.println("Smallest Number is : " + smallest);

        //cleanup
        scanner.close();
    }
}