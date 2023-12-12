package oopspackage.task1pizzashop;

import java.util.ArrayList;

public class Pizza {

    private String base;
    private ArrayList<String> toppings;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
}