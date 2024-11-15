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
        // if (size.equalsIgnoreCase("small")) {
        //            cheesePrice = 0.75#cheese;
        //        } else if (size.equalsIgnoreCase("medium")) {
        //            cheesePrice = 1.50#cheese;
        //        } else if (size.equalsIgnoreCase("large")) {
        //            cheesePrice = 2.25#cheese;
        //        }

        // if (size.equalsIgnoreCase("small")) {
        //            meatPrice = 1#meat;
        //        } else if (size.equalsIgnoreCase("medium")) {
        //            meatPrice = 2#meat;
        //        } else if (size.equalsIgnoreCase("large")) {
        //            meatPrice = 3#meat;
        //        }

        double price = toppingsPrice + basePrice;
        return price;
    }

    @Override
    public String toString() {
        return size + " " + bread + " " + calculatePrice();
    }
}
