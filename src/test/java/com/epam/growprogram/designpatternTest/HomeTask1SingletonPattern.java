package com.epam.growprogram.designpatternTest;


import designpatternpackage.singletonclass.CandyMaker;

public class HomeTask1SingletonPattern {
    public static void main(String[] args) {
        CandyMaker cm = CandyMaker.getInstance();
        cm.fill();
        cm.boil();
        cm.drain();
        CandyMaker cm1 = CandyMaker.getInstance();
    }
}