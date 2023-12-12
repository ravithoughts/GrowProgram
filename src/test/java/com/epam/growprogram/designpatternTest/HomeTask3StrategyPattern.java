package com.epam.growprogram.designpatternTest;

import designpatternpackage.strategyclass.*;

import java.util.Scanner;

public class HomeTask3StrategyPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with txt (t), email (e), or social media (s)?");
        String share = scanner.next();
        PhoneCameraApp cameraApp = new BasicCameraApp();
        switch (share) {
            case ("t"):
                cameraApp.setShareStrategy(new Text());
                break;
            case ("e"):
                cameraApp.setShareStrategy(new Email());
                break;
            case ("s"):
                cameraApp.setShareStrategy(new SocialMedia());
                break;
            default:
                cameraApp.setShareStrategy(new Text());
        }
        cameraApp.takePhoto();
        cameraApp.savePhoto();
        cameraApp.editPhoto();
        cameraApp.sharePhoto();
    }
}