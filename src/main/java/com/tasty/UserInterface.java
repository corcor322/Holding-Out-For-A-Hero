package com.tasty;
//TODO: Add invalid exceptions for drink
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
        scanner.nextLine();
        if (homeChoice == 1) {
            newOrder(scanner);
        } else if (homeChoice == 0) {
            quit = true;
            System.out.println("Enjoy your day! :-)");
        } else
            System.out.println("Invalid choice. Please enter a 1 or a 0.");
        }

    }
    public void newOrder(Scanner scanner) {
        Order order = new Order();
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
            System.out.println("0) Cancel Order - return to home screen");


            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    processAddSandwich(order, scanner);
                    System.out.println("Would you like to make that a combo with chips and a drink? Y/N");
                    String combo = scanner.nextLine();

                    if (combo.equalsIgnoreCase("y")) {
                        processAddChip(order, scanner);
                        processAddDrink(order, scanner);
                        System.out.println("Combo successfully added.");
                    } else if (combo.equalsIgnoreCase("n")) {
                        System.out.println("Sandwich successfully added.");
                    } else
                        System.out.println("Invalid input. Please type 'y' for 'yes' or 'n' for 'no.'");
                    break;
                case "2":
                    processAddDrink(order, scanner);
                    System.out.println("Drink added successfully.");
                    break;
                case "3":
                    processAddChip(order, scanner);
                    System.out.println("Chips added successfully.");
                    break;
                case "4":
                    processCheckOut(order, scanner);
                    break;
                case "0":
                    quit = cancelOrder(scanner, order);
                    break;
                default:
                    System.out.println("Invalid choice. Please type a number 0-4");
            }
        }

    }
    public void processAddSandwich(Order order, Scanner scanner) {
        order.addSandwich(scanner);
    }
    public void processAddDrink(Order order, Scanner scanner) {
        order.addDrink(scanner);
    }
    public void processAddChip(Order order, Scanner scanner) {
        order.addChips(scanner);
    }
    public void processCheckOut(Order order, Scanner scanner) { order.checkOut(scanner);

    }
    public boolean cancelOrder(Scanner scanner, Order order) {

        System.out.println("Are you sure you want to cancel your order? Y/N");
        String cancelOrder = scanner.nextLine();

        if (cancelOrder.equalsIgnoreCase("y")) {
            order.clearOrder();
            System.out.println("Order has been successfully cancelled. Returning to the home screen.");
            return true;
        } else if (cancelOrder.equalsIgnoreCase("n")) {
            System.out.println("Order not cancelled. Returning to order screen.");
            return false;
        } else
            System.out.println("Invalid input. Please type 'y' to cancel order or 'n' to continue.");
        return false;
    }
}
