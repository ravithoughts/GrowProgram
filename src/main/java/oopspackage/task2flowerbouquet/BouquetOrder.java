package oopspackage.task2flowerbouquet;

import java.util.ArrayList;
import java.util.Map;

public class BouquetOrder {
    private double totalOrderCost;

    private final ArrayList<Bouquet> bouquets;

    public BouquetOrder(ArrayList<Bouquet> bouquets) {
        this.bouquets = bouquets;
    }

    public void calculateTotalBouquetCost() {
        final double ROSEFLOWERCOST = 1.00;
        final double JASMINEFLOWERCOST = 2.00;
        final double LILYFLOWERCOST = 3.00;

        for (Bouquet bouquet : bouquets) {

            for (Map.Entry<String, Integer> flower : bouquet.getFlowers().entrySet()) {
                switch (flower.getKey().toLowerCase()) {
                    case "rose":
                        totalOrderCost += flower.getValue() * ROSEFLOWERCOST;
                        break;
                    case "jasmine":
                        totalOrderCost += flower.getValue() * JASMINEFLOWERCOST;
                        break;
                    case "lily":
                        totalOrderCost += flower.getValue() * LILYFLOWERCOST;
                        break;
                    default:
                        totalOrderCost += 0.0;
                        break;
                }
            }
        }
    }

    public void printOrderSummary() {
        for (Bouquet bouquet : bouquets) {
            System.out.println("Ordered a bouquet with flowers " + bouquet.getFlowers());
        }
        System.out.println("TOTAL ORDER AMOUNT: " + totalOrderCost);
    }
}