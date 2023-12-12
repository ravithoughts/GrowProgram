package com.epam.growprogram.java8Test.task5bifunctionalinterfaces;

import java8package.alltasks.Product;

import java.util.*;
import java.util.function.BiFunction;

public class HomeTask5BiFunctionInterface {
    public static void main(String[] args) {

        BiFunction<String, Integer, Product> bi = (name, price) -> new Product(name, price, "Electronics", "Grade A");

        Product product = bi.apply("SmartWatch", 20000);
        Product product1 = bi.apply("Smart TV", 35000);
        Product product2 = bi.apply("Mixer Grinder", 5000);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(product.price, 1);
        map.put(product1.price, 2);
        map.put(product2.price, 3);
        int cartCost = 0;
//        BiFunction <map,Integer,Integer> biCost = (product1,quantity) -> product1.price*quantity;
        BiFunction<Integer, Integer, Integer> biCost = (key, value) -> cartCost + (key * value);
        map.forEach((k, v) -> biCost.apply(k, v));
        System.out.println("The cost of the cart " + cartCost);
    }}