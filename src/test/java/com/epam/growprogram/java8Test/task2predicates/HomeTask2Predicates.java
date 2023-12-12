package com.epam.growprogram.java8Test.task2predicates;

import java8package.alltasks.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HomeTask2Predicates {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product("Laptop", 25000, "Electronics", "Grade A"));
        productsList.add(new Product("Heater", 8000, "Electronics", "Grade B"));
        productsList.add(new Product("Dinning Table", 15000, "Furniture", "Grade A"));
        productsList.add(new Product("Smart Watch", 900, "Electronics", "Grade C"));
        productsList.add(new Product("Sofa", 35000, "Furniture", "Grade A"));

        Predicate<Product> pr = product -> (product.price > 1000); // Creating predicate
        Predicate<Product> prCategory = product -> (product.category.equalsIgnoreCase("Electronics"));

        List<String> productName = productsList.stream()
                .filter(pr).map(p -> p.name).collect(Collectors.toList());
        System.out.println("Products with price greater than 1000 " + productName); // Calling Predicate method

        productName = productsList.stream().filter(prCategory).map(p -> p.name).collect(Collectors.toList());
        System.out.println("Products under electronics category " + productName); // Calling Predicate method

        productName = productsList.stream().filter(pr.and(prCategory)).map(p -> p.name).collect(Collectors.toList());
        System.out.println("Products under electronics category and price > 1000 " + productName); // Calling Predicate method
    }}