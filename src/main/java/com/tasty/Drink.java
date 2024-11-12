package com.tasty;

public class Drink implements IPriceable{
    private String type;
    private String size;

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        return IPriceable.super.calculatePrice();
    }
}
