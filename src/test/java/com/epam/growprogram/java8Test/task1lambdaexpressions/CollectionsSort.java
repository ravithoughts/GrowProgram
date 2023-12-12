package com.epam.growprogram.java8Test.task1lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsSort {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Mark");
        employees.add("Justin");
        employees.add("Rohit");
        employees.add("Arun");
        employees.add("David");
        System.out.println("List of employees before sorting : ");
        Iterator<String> it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collections.sort(employees, Collections.reverseOrder());

        System.out.println("List of employees after sorting in descending order of their name:");
        it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}