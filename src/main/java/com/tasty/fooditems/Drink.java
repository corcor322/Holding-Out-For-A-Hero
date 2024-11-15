package com.tasty.fooditems;

import com.tasty.IPriceable;

public class Drink implements IPriceable {
    private String type;
    private String size;

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        double price = 2.00;
        if (size.equalsIgnoreCase("small")) {
            price = 2.00;
        } else if (size.equalsIgnoreCase("medium")) {
            price = 2.50;
        } else if (size.equalsIgnoreCase("large")) {
            price = 3.00;
        }
        return price;
    }

    @Override
    public String toString() {
        return size + " " + type + " " + calculatePrice();
    }
}
