package com.tasty;

public class Drink implements IPriceable{
    private String type;
    private String size;

    @Override
    public double calculatePrice() {
        return IPriceable.super.calculatePrice();
    }
}
