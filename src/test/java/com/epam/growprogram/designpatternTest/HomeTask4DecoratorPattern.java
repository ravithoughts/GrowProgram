package com.epam.growprogram.designpatternTest;

import designpatternpackage.decoratorclass.*;

import java.util.Scanner;

public class HomeTask4DecoratorPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the version Desktop or Mobile");
        String version = scanner.next();
        System.out.println("Enter the widget chatWidget or OnlineWidget");
        String widgetCategory = scanner.next();
        WebPage webPage = null;
        int rank = 0;
        switch (version.toUpperCase()) {
            case "MOBILE":
                webPage = new MobileVersion();
                rank += webPage.rank();
                break;
            case "DESKTOP":
                webPage = new DesktopVersion();
                rank += webPage.rank();
                break;
            default:
                System.out.println("Invalid Selection");
        }

        switch (widgetCategory.toUpperCase()) {
            case "CHATWIDGET":
                webPage = new ChatWidget(webPage);
                rank += webPage.rank();
                break;
            case "ONLINEWIDGET":
                webPage = new OnlineReviewWidget(webPage);
                rank += webPage.rank();
                break;
            default:
                System.out.println("Invalid Selection");
        }
        System.out.println("The rank of the page is " + rank);
    }
}