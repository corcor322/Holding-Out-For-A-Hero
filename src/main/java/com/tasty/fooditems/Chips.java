package com.tasty.fooditems;

import com.tasty.IPriceable;

public class Chips implements IPriceable {
    private String type;

    public String getType() {
        return type;
    }

    public Chips(String type) {
        this.type = type;
    }

    @Override
    public double calculatePrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        return type + " " + calculatePrice();
    }
}
