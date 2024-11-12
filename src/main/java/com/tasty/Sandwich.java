package com.tasty;

import com.tasty.toppings.Topping;

import java.util.ArrayList;

public class Sandwich implements IPriceable{
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
        return IPriceable.super.calculatePrice();
    }
}
