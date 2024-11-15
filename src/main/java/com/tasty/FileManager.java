package com.tasty;

import com.tasty.fooditems.Chips;
import com.tasty.fooditems.Drink;
import com.tasty.fooditems.Sandwich;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FileManager {
    private static final String filePath = "receipts/";

    // Method to save a receipt for an order
    public void saveReceipt(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips, double totalPrice) {
        // Create the directory if it does not exist
        File directory = new File(filePath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Format the current date and time for the filename
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);
        String filename = filePath + timestamp + ".txt";

        // Write the order details to the file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            String receiptContent = createReceipt(sandwiches, drinks, chips, totalPrice);
            bw.write(receiptContent);
            System.out.println("Receipt saved successfully: " + filename);
        } catch (IOException e) {
            System.err.println("Error writing the receipt: " + e.getMessage());
        }
    }
    public String createReceipt(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips, double totalPrice) {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Order Receipt\n");
        receipt.append("---------------\n");

        receipt.append("Sandwiches:\n");
        for (Sandwich sandwich : sandwiches) {
            receipt.append(sandwich).append("\n");
        }

        receipt.append("\nDrinks:\n");
        for (Drink drink : drinks) {
            receipt.append(drink).append("\n");
        }

        receipt.append("\nChips:\n");
        for (Chips chip : chips) {
            receipt.append(chip).append("\n");
        }

        receipt.append("\nTotal Price: $").append(String.format("%.2f", totalPrice)).append("\n");
        return receipt.toString();

    }
}

