package com.epam.growprogram.java8Test.task9datetime;

import java.time.LocalDate;
import java.util.function.Predicate;

public class HomeTask9DateTime {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2023, 12, 20);
        LocalDate yesterdayDate = localDate.minusDays(1);
        LocalDate expectedYesterdayDate = LocalDate.of(2023, 12, 19);

        Predicate<LocalDate> pr = expectedDate -> (expectedDate.equals(yesterdayDate));
        System.out.println("Is the date yesterday ? " + pr.test(expectedYesterdayDate));

        expectedYesterdayDate = LocalDate.of(2024, 12, 19);

        Predicate<LocalDate> pr1 = expectedDate -> (expectedDate.equals(yesterdayDate));
        System.out.println("Is the date yesterday ? " + pr.test(expectedYesterdayDate));
    }
}