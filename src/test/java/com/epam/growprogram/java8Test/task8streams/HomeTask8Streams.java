package com.epam.growprogram.java8Test.task8streams;

import java8package.alltasks.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeTask8Streams {

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product("Laptop", 25000, "Electronics", "Grade A"));
        productsList.add(new Product("Heater", 8000, "Electronics", "Grade B"));
        productsList.add(new Product("Dinning Table", 15000, "Furniture", "Grade A"));
        productsList.add(new Product("Smart Watch", 900, "Electronics", "Grade C"));
        productsList.add(new Product("Sofa", 35000, "Furniture", "Grade A"));

        // From the given list of the products get all the products with price > 1000/-
        List<String> productName = productsList.stream()
                .filter(p -> p.price > 1000)
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println("Products with price > 1000/- " + productName);

        // From the given list of the products get all the products from electronics category.
        //Calculate the count of all electronic products in the given list of products.
        List<String> electronicCategory = productsList.stream()
                .filter(p -> p.category.equalsIgnoreCase("Electronics"))
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println("Products under electronic Category " + electronicCategory);
        System.out.println("Count of Products under electronic Category " + electronicCategory.size());

        //From the given list of the products get all the products with price> 1000/- and from electronics category. Change the name of the result list into CAP letters before printing.
        List<String> productCAPS = productsList.stream()
                .filter(p -> p.price > 1000 && p.category.equalsIgnoreCase("Electronics"))
                .map(p -> p.name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Products with price > 1000/- under electronic Category in CAPS " + productCAPS);
    }
}