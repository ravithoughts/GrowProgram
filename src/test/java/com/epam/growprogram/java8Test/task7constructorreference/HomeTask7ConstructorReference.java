package com.epam.growprogram.java8Test.task7constructorreference;

import java8package.task7constructorreference.Employee;
import java8package.task7constructorreference.EmployeeDetails;

public class HomeTask7ConstructorReference {

    public static void main(String[] args) {
        EmployeeDetails empDetails = Employee::new;
        System.out.println("The employee details using constructor reference-> " + empDetails.get("Ravi", 12344546, 25000f));
    }
}