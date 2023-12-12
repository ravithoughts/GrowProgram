package com.epam.growprogram.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeTaskMap {

    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int numPersons = input.nextInt();

        //Adding to the phone book
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter the name of person: ");
            String name = input.next();
            System.out.println("Enter the phone number of person: ");
            String phone = input.next();
            phoneBook.put(name, phone);
        }

        // Type Exit to complete the search
        while (input.hasNext()) {
            String inputName = input.next();
            if (!inputName.equalsIgnoreCase("exit")) {
                if (phoneBook.containsKey(inputName)) {
                    System.out.println(inputName + "=" + phoneBook.get(inputName));
                } else {
                    System.out.println("Not found");
                }
            } else
                break;
        }
    }
}