package com.tasty.toppings;

public class Meat extends PremiumTopping{
    private String meat;

    public Meat(String meat) {
        this.meat = meat;
    }

    @Override
    public double calculatePrice(String size) {

        switch (size) {
            case "small":
                return 1.00;
            case "medium":
                return 2.00;
            case "large":
                return 3.00;
            default:
                return 0;
        }


    }
}
