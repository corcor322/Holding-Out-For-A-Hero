package com.tasty.fooditems;

import com.tasty.IPriceable;
import com.tasty.toppings.Topping;

import java.util.ArrayList;

public class Sandwich implements IPriceable {
    private String size;
    private String bread;
    private ArrayList toppings;
    private boolean isToasted;

    public Sandwich(String size, String bread, ArrayList toppings, boolean isToasted) {
        this.size = size;
        this.bread = bread;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }

    public String getSize() {
        return size;
    }

    public String getBread() {
        return bread;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public boolean isToasted() {
        return isToasted;
    }
    public Topping addTopping() {
        return null;
    }
    public void makeCombo() {

    }

    @Override
    public double calculatePrice() {

        double basePrice = 5.50;
        if (size.equalsIgnoreCase("small")) {
            basePrice = 5.50;
        } else if (size.equalsIgnoreCase("medium")) {
            basePrice = 7.00;
        } else if (size.equalsIgnoreCase("large")) {
            basePrice = 8.50;
        }
        double cheesePrice = 0;

        double meatPrice = 0;
        double toppingsPrice = cheesePrice + meatPrice;


        double price = toppingsPrice + basePrice;
        return price;
    }

    @Override
    public String toString() {
        return size + " " + bread + " " + calculatePrice();
    }
}
