package com.epam.growprogram.corejava.task1variables;

public class HomeTaskVariables {

    public static void main(String[] args) {

        HomeTaskVariables sum = new HomeTaskVariables();

        System.out.println("Apples with Daniel and Amber together (Integer): " +
                sum.sumOfApples(3, 2));
        System.out.println("Apples with Daniel and Amber together (Double): " +
                sum.sumOfApples(3.5, 2.5));
    }

    public double sumOfApples(double app1, double app2) { return app1 + app2;}

    public int sumOfApples(int app1, int app2) {return app1 + app2;}
}