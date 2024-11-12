package com.tasty;

import com.tasty.toppings.Meat;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
        System.out.println("Welcome!");
        System.out.println("");
        System.out.println("1) New Order");
        System.out.println("0) Exit");

        int homeChoice = scanner.nextInt();
        if (homeChoice == 1) {
            newOrder(scanner);
        } else if (homeChoice == 0) {
            quit = true;
            System.out.println("Enjoy your day! :-)");
        } else
            System.out.println("Invalid choice. Please enter a 1 or a 0.");
        }

    }
    public ArrayList newOrder(Scanner scanner) {
        ArrayList order = new ArrayList<>();
        boolean quit = false;

        while (!quit) {
            System.out.println("Order Screen");
            System.out.println("-----");
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order - return to homescreen");

            scanner.nextLine();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    processAddSandwich(scanner);
                    System.out.println("Would you like to make that a combo with chips and a drink? Y/N");
                    String combo = scanner.nextLine();

                    if (combo.equalsIgnoreCase("y")) {
                        processAddChip();
                        processAddDrink();
                        System.out.println("Combo successfully added.");
                    } else if (combo.equalsIgnoreCase("n")) {
                        System.out.println("Sandwich successfully added.");
                    } else
                        System.out.println("Invalid input. Please type 'y' for 'yes' or 'n' for 'no.'");
                    break;
                case "2":
                    processAddDrink();
                    System.out.println("Drink added successfully.");
                    break;
                case "3":
                    processAddChip();
                    System.out.println("Chips added successfully.");
                    break;
                case "4":
                    processCheckOut();
                    break;
                case "0":
                    cancelOrder();
                    break;
                default:
                    System.out.println("Invalid choice. Please type a number 0-4");
            }
        }

        return order;
    }
    public Sandwich processAddSandwich(Scanner scanner) {
        System.out.println("Select the size of sandwich you would like to add:");
        System.out.println("Small- 4 inches/10.16 cm");
        System.out.println("Medium- 8 inches/20.32 cm");
        System.out.println("Large- 12 inches/30.48 cm");

        String size = scanner.nextLine();

        switch (size) {
            case "small":
                break;
            case "medium":
                break;
            case "large":
                break;
            default:
                System.out.println("Invalid choice. Please choose small, medium, or large.");
        }
        System.out.println("Select the type of bread you would like to add");
        System.out.println("White");
        System.out.println("Wheat");
        System.out.println("Rye");
        System.out.println("Wrap");

        String bread = scanner.nextLine();

        // Add meats arraylist
        // Add sauces arraylist
        // Add cheeses arraylist
        // Add regular toppings arraylist
        // Add all toppings arraylist
        ArrayList toppings = new ArrayList<>();

        System.out.println("Would you like your sandwich toasted? y/n");

        String toasted = scanner.nextLine();
        boolean isToasted = false;

        if(toasted.equalsIgnoreCase("y")) {
            isToasted = true;
        } else if (toasted.equalsIgnoreCase("n")) {
            isToasted = false;
        } else
            System.out.println("Invalid option. Please enter 'y' for yes or 'n' for 'no.'");

        return new Sandwich(size, bread, toppings, isToasted);
    }
    public Drink processAddDrink() {
        return null;
    }
    public Chips processAddChip() {
        return null;
    }
    public void processCheckOut() {

    }
    public void cancelOrder() {

    }
}
