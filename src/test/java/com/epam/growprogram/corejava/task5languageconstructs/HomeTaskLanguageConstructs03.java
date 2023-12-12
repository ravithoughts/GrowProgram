package com.epam.growprogram.corejava.task5languageconstructs;

import java.util.Scanner;

public class HomeTaskLanguageConstructs03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String value:");
        String stringValue = scanner.next();

        int occurence = maxBlock(stringValue);
        System.out.println("The length of the largest block in a given string is: " + occurence);
    }

    public static int maxBlock(String str) {
        int len = str.length();
        int count = 0;
        int tempcount = 1;

        if (len == 0)
            return 0;

        for (int i = 0; i < len; i++) {
            if (i < len - 1 && str.charAt(i) == str.charAt(i + 1))
                tempcount++;
            else
                tempcount = 1;
            if (tempcount > count)
                count = tempcount;
        }
        return count;
    }
}