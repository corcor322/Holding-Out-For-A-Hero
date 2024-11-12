package com.tasty;
//TODO: While loop for newOrder as well
import java.util.ArrayList;
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
                processAddSandwich();
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
        return order;
    }
    public Sandwich processAddSandwich() {
        return null;
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
