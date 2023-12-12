package com.epam.growprogram.corejava.task6loopsandArrays;

import java.util.Scanner;
import java.util.logging.Logger;

public class HomeTaskLoopsAndArrays {
    static Logger log = Logger.getLogger(HomeTaskLoopsAndArrays.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arrNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the numbers:");
            arrNumbers[i] = scanner.nextInt();
        }
        int numberOfClumps = countClumps(arrNumbers);
        log.info("The number of Clumps in a given array is " + numberOfClumps);
    }

    public static int countClumps(int[] arrNumber) {
        int length = arrNumber.length;
        int clumps = 0;
        for (int i = 0; i < length - 1; i++) {
            int flag = 0;
            while (i < length - 1
                    && arrNumber[i] == arrNumber[i + 1]) {
                flag = 1;
                i++;
            }
            if (flag == 1) {
                clumps++;
            }
        }
        return clumps;
    }
}