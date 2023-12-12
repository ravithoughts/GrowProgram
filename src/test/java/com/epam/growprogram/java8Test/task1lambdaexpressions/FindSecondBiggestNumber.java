package com.epam.growprogram.java8Test.task1lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondBiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 14, 18, 9, 27, 1};
        System.out.println("Numbers in an Array : " + Arrays.toString(numbers));

        // sort in descending-order and get 2nd biggest element
        int secondBiggestNumber = Arrays
                .stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second biggest number in an Array is: " + secondBiggestNumber);
    }
}