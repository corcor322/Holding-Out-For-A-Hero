package com.tasty;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<Chips> chips;
    private ArrayList<Drink> drinks;

    public Order() {
        sandwiches = new ArrayList<>();
        chips = new ArrayList<>();
        drinks = new ArrayList<>();
    }

    public void addSandwich(Scanner scanner) {
        System.out.println("Select the size of sandwich you would like to add:");
        System.out.println("Small- 4 inches/10.16 cm");
        System.out.println("Medium- 8 inches/20.32 cm");
        System.out.println("Large- 12 inches/30.48 cm");

        String size = scanner.nextLine();

        switch (size.toLowerCase()) {
            case "small":
            case "medium":
            case "large":
                break;
            default:
                System.out.println("Invalid choice. Please choose small, medium, or large.");
                return; // Exit the method if the input is invalid
        }

        System.out.println("Select the type of bread you would like to add");
        System.out.println("White");
        System.out.println("Wheat");
        System.out.println("Rye");
        System.out.println("Wrap");

        String bread = scanner.nextLine();

        ArrayList<String> toppings = new ArrayList<>();
        // Add logic for meat, cheese, regular toppings and sauce

        System.out.println("Would you like your sandwich toasted? y/n");

        String toasted = scanner.nextLine();
        boolean isToasted = toasted.equalsIgnoreCase("y");

        if (!toasted.equalsIgnoreCase("y") && !toasted.equalsIgnoreCase("n")) {
            System.out.println("Invalid option. Please enter 'y' for yes or 'n' for 'no.'");
            return; // Exit if the input is invalid
        }

        Sandwich sandwich = new Sandwich(size, bread, toppings, isToasted);
        sandwiches.add(sandwich);
        System.out.println("Sandwich added to the order!");
    }

    public void addDrink(Scanner scanner) {
        System.out.println("Please select the type of drink you would like to add:");
        System.out.println("Root Beer");
        System.out.println("Orange Soda");
        System.out.println("Grape Soda");
        System.out.println("Cola");
        System.out.println("Water");
        System.out.println("Lemonade");
        String type = scanner.nextLine();

        System.out.println("Enter the size drink you would like:");
        System.out.println("Small");
        System.out.println("Medium");
        System.out.println("Large");
        String size = scanner.nextLine();

        Drink drink = new Drink(type, size);
        drinks.add(drink);
        System.out.println("Drink added to the order!");
    }

    public void addChips(Scanner scanner) {
        System.out.println("Please select the type of chip you would like to add:");
        System.out.println("Salt & Vinegar");
        System.out.println("Original");
        System.out.println("Cheddar Sour Cream");
        System.out.println("BBQ");
        System.out.println("Hot Honey Jalapeño");
        System.out.println("All-Dressed");

        String type = scanner.nextLine();

        Chips chip = new Chips(type);
        chips.add(chip);
        System.out.println("Chips added to the order!");
    }
}

