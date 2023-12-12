package com.epam.growprogram.java8Test.task4consumersupplier;

import java.util.function.Supplier;

public class HomeTask4SupplierInterface {
    public static void main(String[] args) {
        System.out.println("Generate Random OTP");
        Supplier<String> otp = () -> {
            String strOtp = "";
            for (int i = 0; i < 6; i++) {
                strOtp = strOtp + (int) (Math.random() * 10);
            }
            return strOtp;
        };
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
    }
}