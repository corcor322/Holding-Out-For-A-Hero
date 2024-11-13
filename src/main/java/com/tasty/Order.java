package com.tasty;

import com.tasty.toppings.*;

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

        ArrayList<Topping> toppings = new ArrayList<>();
        ArrayList<Meat> meats = new ArrayList<>();
        ArrayList<Cheese> cheeses = new ArrayList<>();
        ArrayList<Sauce> sauces = new ArrayList<>();
        ArrayList<RegularTopping> regularToppings = new ArrayList<>();
        // Add logic for meat, cheese, regular toppings and sauce


        
        //MEATMEATMEATMEATMEATMEATMEAT
        System.out.println("Would you like to add meat to your sandwich? y/n");
        String wantMeat = scanner.nextLine();

        while (wantMeat.equalsIgnoreCase("y")) {
            System.out.println("What kind of meat would you like to add?:");
            System.out.println("Steak");
            System.out.println("Ham");
            System.out.println("Salami");
            System.out.println("Roast Beef");
            System.out.println("Chicken");
            System.out.println("Bacon");

            String myMeat = scanner.nextLine();

            switch (myMeat.toLowerCase()) {
                case "steak":
                case "ham":
                case "salami":
                case "roast beef":
                case "chicken":
                case "bacon":
                    Meat meat = new Meat(myMeat);
                    meats.add(meat);
                    System.out.println("Meat successfully added.");
                    break;
                default:
                    System.out.println("Invalid input. Please specify one of the meat types provided.");
                    continue; // Re-prompt for valid meat type
            }

            // Ask if the user wants to add more meat
            System.out.println("Would you like to add another meat? y/n");
            wantMeat = scanner.nextLine();

            if (!wantMeat.equalsIgnoreCase("y") && !wantMeat.equalsIgnoreCase("n")) {
                System.out.println("Invalid option. Please enter 'y' for 'yes' or 'n' for 'no.'");
                break; // Exit if an invalid response is given
            }
        }

        if (wantMeat.equalsIgnoreCase("n")) {
            System.out.println("No more meat will be added.");
        }
        //MEATMEATMEATMEATMEATMEAT





        //CHEESECHEESECHEESECHEESECHEESE


        System.out.println("Would you like to add cheese to your sandwich? y/n");
        String wantCheese = scanner.nextLine();

        while (wantCheese.equalsIgnoreCase("y")) {
            System.out.println("What kind of meat would you like to add?:");
            System.out.println("American");
            System.out.println("Provolone");
            System.out.println("Cheddar");
            System.out.println("Swiss");

            String myCheese = scanner.nextLine();

            switch (myCheese.toLowerCase()) {
                case "american":
                case "provolone":
                case "cheddar":
                case "swiss":
                    Cheese cheese = new Cheese(myCheese);
                    cheeses.add(cheese);
                    System.out.println("Cheese successfully added.");
                    break;
                default:
                    System.out.println("Invalid input. Please specify one of the cheese types provided.");
                    continue; // Re-prompt for valid cheese type
            }

            // Ask if the user wants to add more cheese
            System.out.println("Would you like to add another cheese? y/n");
            wantCheese = scanner.nextLine();

            if (!wantCheese.equalsIgnoreCase("y") && !wantCheese.equalsIgnoreCase("n")) {
                System.out.println("Invalid option. Please enter 'y' for 'yes' or 'n' for 'no.'");
                break; // Exit if an invalid response is given
            }
        }

        if (wantCheese.equalsIgnoreCase("n")) {
            System.out.println("No more cheese will be added.");
        }

















        //CHEESECHEESECHEESECHEESECHEESE

        System.out.println("Would you like your sandwich toasted? y/n");

        String toasted = scanner.nextLine();
        boolean isToasted = toasted.equalsIgnoreCase("y");

        if (!toasted.equalsIgnoreCase("y") && (!toasted.equalsIgnoreCase("n"))) {
            System.out.println("Invalid option. Please enter 'y' for 'yes' or 'n' for 'no.'");
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

