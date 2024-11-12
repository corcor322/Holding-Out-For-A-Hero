package com.tasty;

public interface IPriceable {
    public default double calculatePrice() {
        return 0;
    }
}
