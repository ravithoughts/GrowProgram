package com.epam.growprogram.java8Test.task3functioninterface;

import java8package.alltasks.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HomeTask3FunctionInterface {
    static Integer addPrice(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product("Laptop", 25000, "Electronics", "Grade A"));
        productsList.add(new Product("Heater", 8000, "Electronics", "Grade B"));
        productsList.add(new Product("Dinning Table", 15000, "Furniture", "Grade A"));
        productsList.add(new Product("Smart Watch", 900, "Electronics", "Grade C"));
        productsList.add(new Product("Sofa", 35000, "Furniture", "Grade A"));

        List<Integer> productPrice = productsList.stream().map(p -> p.price).collect(Collectors.toList());
        Function<List<Integer>, Integer> fun = HomeTask3FunctionInterface::addPrice;

        int result = fun.apply(productPrice);
        System.out.println("Cost of all Products in given list " + result);
    }
}