package com.epam.growprogram.corejava.task5languageconstructs;

import java.util.Scanner;

public class HomeTaskLanguageConstructs01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed");
        int speed = scanner.nextInt();

        System.out.println("Is today your birthday? - True, False");
        boolean birthday = scanner.nextBoolean();

        int ticketValue = stopSpeeding(speed, birthday);
        System.out.println("Ticket Value: " + ticketValue);
    }

    public static int stopSpeeding(int speed, boolean isBirthday) {
        if (!(isBirthday)) {
            if (speed <= 60)
                return 0;
            else if (speed > 60 && speed <= 80)
                return 1;
            else
                return 2;
        } else if (speed <= 65)
            return 0;
        else if (speed > 65 && speed <= 85)
            return 1;
        else
            return 2;
    }
}