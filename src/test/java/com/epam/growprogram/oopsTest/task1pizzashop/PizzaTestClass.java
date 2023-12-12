package com.epam.growprogram.oopsTest.task1pizzashop;

import oopspackage.task1pizzashop.Pizza;
import oopspackage.task1pizzashop.PizzaOrder;

import java.util.Scanner;
import java.util.ArrayList;

public class PizzaTestClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Pizza> pizzas = new ArrayList<>();

        // Reading input regarding number of pizzas
        System.out.println("Enter the total pizzas you would like to order: ");
        int totalPizzas = scanner.nextInt();

        // Reading input regarding pizza base and pizza toppings
        for (int i = 0; i < totalPizzas; i++) {
            Pizza pizza = new Pizza();
            ArrayList<String> toppings = new ArrayList<>();
            String pizzaBase;
            int totalToppings;

            System.out.println("Enter the base of the pizza Standard, Soft: ");
            pizzaBase = scanner.next();
            pizza.setBase(pizzaBase);

            System.out.println("Enter the total number of toppings on the pizza Maximum up to 3: ");
            totalToppings = scanner.nextInt();
            if (totalToppings <= 3) {
                for (int j = 0; j < totalToppings; j++) {
                    System.out.println("Enter the topping Tomato,Corn,Mushrooms: ");
                    String topping = scanner.next();
                    toppings.add(topping);
                }
            } else {
                System.out.println("Selected more than 3. Enter the total number of toppings on the pizza only up to Maximum 3: ");
                totalToppings = scanner.nextInt();
            }

            pizza.setToppings(toppings);
            pizzas.add(pizza);
        }

        // Creating PizzaOrder object,Calculate Pizza Cost and print Order Summary
        PizzaOrder order = new PizzaOrder(pizzas);
        order.calculateTotalPizzaCost();
        order.printOrderSummary();

        // Cleanup
        scanner.close();
    }
}