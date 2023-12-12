package com.epam.growprogram.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HomeTaskTreeMap {
    static Map<String, String> treeMap = new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int numberOftestCases = sc.nextInt();
        for (int i = 0; i < numberOftestCases; i++) {
            System.out.println("Enter the number of Queries:");
            int numberOfQueries = sc.nextInt();
            for (int j = 0; j < numberOfQueries; j++) {
                System.out.println("Enter the Queries a -> Add Values to Map  " +
                        " b -> Print Value if present in map " +
                        " c -> Print the size of the map" +
                        " d -> Remove an entry" +
                        " e -> Print Sorted Map");
                treeMapOperations(sc.next());
            }
        }
    }

    private static void treeMapOperations(String next) {
        Scanner sc = new Scanner(System.in);
        switch (next.toLowerCase()) {
            case "a": {
                System.out.println("Enter the Key and Enter the Value");
                treeMap.put(sc.next(), sc.next());
                break;
            }
            case "b": {
                System.out.println("Enter the Key to search");
                System.out.println(treeMap.get(sc.next()));
                break;
            }
            case "c": {
                System.out.println("Size of the Map " + treeMap.size());
                break;
            }
            case "d": {
                System.out.println("Enter the Key to be removed");
                treeMap.remove(sc.next());
                break;
            }
            case "e": {
                System.out.println("Printing the map");
                for (Map.Entry<String, String> entry : treeMap.entrySet()) {
                    System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
                }
                break;
            }
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}