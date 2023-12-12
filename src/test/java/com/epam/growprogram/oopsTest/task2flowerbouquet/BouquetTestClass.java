package com.epam.growprogram.oopsTest.task2flowerbouquet;

import oopspackage.task2flowerbouquet.Bouquet;
import oopspackage.task2flowerbouquet.BouquetOrder;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class BouquetTestClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Bouquet> bouquets = new ArrayList<>();

        // Reading input regarding number of bouquets
        System.out.println("Enter the total bouquets you would like to order: ");
        int totalBouquets = scanner.nextInt();

        // Reading input regarding bouquet flowers
        for (int i = 0; i < totalBouquets; i++) {
            Bouquet bouquet = new Bouquet();
            LinkedHashMap<String, Integer> flowers = new LinkedHashMap<>();
            int totalRoseFlowers;
            int totalJasmineFlowers;
            int totalLilyFlowers;

            System.out.println("Enter the total number of Rose flowers: ");
            totalRoseFlowers = scanner.nextInt();
            flowers.put("Rose", totalRoseFlowers);

            System.out.println("Enter the total number of Jasmine flowers: ");
            totalJasmineFlowers = scanner.nextInt();
            flowers.put("Jasmine", totalJasmineFlowers);

            System.out.println("Enter the total number of Lily flowers: ");
            totalLilyFlowers = scanner.nextInt();
            flowers.put("Lily", totalLilyFlowers);

            bouquet.setFlowers(flowers);
            bouquets.add(bouquet);
        }

        // Creating BouquetOrder object,Calculate Bouquet Cost and print Order Summary
        BouquetOrder order = new BouquetOrder(bouquets);
        order.calculateTotalBouquetCost();
        order.printOrderSummary();

        // Cleanup
        scanner.close();
    }
}