package com.tasty;

public class Chips implements IPriceable{
    private String type;

    @Override
    public double calculatePrice() {
        return IPriceable.super.calculatePrice();
    }
}
