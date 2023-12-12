package com.epam.growprogram.corejava.task3loops;

import java.util.Scanner;

public class HomeTaskLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();

        System.out.println("Enter the skip count");
        int skipCount = scanner.nextInt();

        System.out.println("Enter the loop type - for, while, do-while");
        switch (scanner.next().toLowerCase()) {
            case ("for"): {
                printPatternForLoop(rows, skipCount);
                break;
            }

            case ("do-while"): {
                break;
            }

            default: {
                System.out.println("Invalid Loop");
            }
        }
    }

    public static void printPatternForLoop(int rows, int skipCount) {

        int baseCount = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(baseCount + " ");
                baseCount = baseCount + skipCount;
            }
            System.out.println();
        }
    }
}