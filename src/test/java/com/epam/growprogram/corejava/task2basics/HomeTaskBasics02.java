package com.epam.growprogram.corejava.task2basics;

import java.util.Scanner;

public class HomeTaskBasics02 {

    public static void main(String[] args) {
        double number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        System.out.println("Choose an operator: +, -, *, /, %, calculatePercentage");

        String operator = input.next();
        double result = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;

            case "-":
                result = number1 - number2;
                break;

            case "*":
                result = number1 * number2;
                break;

            case "/":
                try {
                    result = number1 / number2;
                    break;
                } catch (ArithmeticException exception) {
                    System.out.println("ArithmeticException => " + exception.getMessage());
                }

            // Option for reminder
            case "%":
                try {
                    result = number1 % number2;
                    break;
                } catch (ArithmeticException exception) {
                    System.out.println("ArithmeticException => " + exception.getMessage());
                }

            // percentage Calculation
            case "calculatePercentage":
                try {
                    result = number1 / number2 * 100;
                    break;
                } catch (ArithmeticException exception) {
                    System.out.println("ArithmeticException => " + exception.getMessage());
                }

            default:
                System.out.println("Invalid operator");
        }

        System.out.println("The final result:");
        System.out.println();

        // print the final result
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);

        //cleanup
        input.close();
    }
}