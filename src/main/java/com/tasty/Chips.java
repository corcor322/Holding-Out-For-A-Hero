package com.tasty;

public class Chips implements IPriceable{
    private String type;

    public Chips(String type) {
        this.type = type;
    }

    @Override
    public double calculatePrice() {
        return IPriceable.super.calculatePrice();
    }
}
