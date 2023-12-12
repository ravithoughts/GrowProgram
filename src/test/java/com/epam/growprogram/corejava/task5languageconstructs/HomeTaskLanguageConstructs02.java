package com.epam.growprogram.corejava.task5languageconstructs;

import java.util.Scanner;

public class HomeTaskLanguageConstructs02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = scanner.nextInt();

        System.out.println("Enter number2");
        int number2 = scanner.nextInt();

        boolean result = greatSix(number1, number2);
        System.out.println("The Result is:" + result);
    }

    public static boolean greatSix(int number1, int number2) {
        if (number1 == 6 || number2 == 6) {
            return true;
        }
        int sum = number1 + number2;
        int diff = Math.abs(number1 - number2);
        {
            if (sum == 6 || diff == 6) {
                return true;
            } else {
                return false;
            }
        }
    }
}