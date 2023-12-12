package com.epam.growprogram.designpatternTest;


import designpatternpackage.builderclass.Bicycle;
import designpatternpackage.builderclass.BicycleBuildDirector;
import designpatternpackage.builderclass.KidsBicycle;

public class HomeTask5BuilderPattern {
    public static void main(String[] args) {
        BicycleBuildDirector buildDirector = new BicycleBuildDirector();
        Bicycle bicycle = buildDirector.Construct(new KidsBicycle(), "Red", 16);
    }
}