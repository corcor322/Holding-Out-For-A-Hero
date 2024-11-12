package com.tasty;

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

        } else if (homeChoice == 0) {
            quit = true;
            System.out.println("Enjoy your day! :-)");
        } else
            System.out.println("Invalid choice. Please enter a 1 or a 0.");
        }

    }
    public ArrayList newOrder() {
        return null;
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
