package com.epam.growprogram.java8Test.task4consumersupplier;

import java8package.alltasks.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import java.util.stream.Collectors;

public class HomeTask4ConsumerInterface {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product("Laptop", 25000, "Electronics", "Grade A"));
        productsList.add(new Product("Heater", 8000, "Electronics", "Grade B"));
        productsList.add(new Product("Dinning Table", 15000, "Furniture", "Grade A"));
        productsList.add(new Product("Smart Watch", 900, "Electronics", "Grade C"));
        productsList.add(new Product("Sofa", 35000, "Furniture", "Grade A"));

        List<String> product = productsList.stream().filter(p -> p.price > 1000).map(p -> p.grade).collect(Collectors.toList());
        Consumer<List<String>> consumer = list -> product.replaceAll(p -> "Premium");
        Consumer<List<String>>
                dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
        consumer.andThen(dispList).accept(product);
    }
}