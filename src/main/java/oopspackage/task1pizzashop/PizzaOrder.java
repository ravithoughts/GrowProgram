package oopspackage.task1pizzashop;

import java.util.ArrayList;

public class PizzaOrder {
    private double totalOrderCost;

    private final ArrayList<Pizza> pizzas;

    public PizzaOrder(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void calculateTotalPizzaCost() {
        final double STANDARDCOST = 900.00;
        final double SOFTCOST = 800.00;
        final double TOMATOTOPPINGS = 10.00;
        final double CORNTOPPINGS = 25.00;
        final double MUSHROOMTOPPINGS = 50.00;

        for (Pizza pizza : pizzas) {
            switch (pizza.getBase().toLowerCase()) {
                case "standard":
                    totalOrderCost += STANDARDCOST;
                    break;
                case "soft":
                    totalOrderCost += SOFTCOST;
                    break;
                default:
                    totalOrderCost += 0.0;
                    break;
            }

            for (String toppings : pizza.getToppings()) {
                switch (toppings.toLowerCase()) {
                    case "tomato":
                        totalOrderCost += TOMATOTOPPINGS;
                        break;
                    case "corn":
                        totalOrderCost += CORNTOPPINGS;
                        break;
                    case "mushroom":
                        totalOrderCost += MUSHROOMTOPPINGS;
                        break;
                    default:
                        totalOrderCost += 0.0;
                        break;
                }

            }
        }
    }

    public void printOrderSummary() {
        for (Pizza pizza : pizzas) {
            System.out.println("Ordered a pizza with base " + pizza.getBase() + " and toppings " + pizza.getToppings());
        }
        System.out.println("TOTAL ORDER AMOUNT: " + totalOrderCost);
    }
}