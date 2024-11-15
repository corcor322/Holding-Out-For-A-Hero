package com.tasty.toppings;

public class Cheese extends PremiumTopping{
    private String cheese;

    public Cheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public double calculatePrice(String size) {
        switch(size) {
            case "small":
                return 0.75;
            case "medium":
                return 1.5;
            case "large":
                return 2.25;
            default:
                return 0;
        }


    }
}
