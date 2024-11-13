package com.tasty;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileManager {
    private static final String filePath = "receipts/";

    // Method to save a receipt for an order
    public void saveReceipt(Order order) {
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
            bw.write(createReceipt(order));

            System.out.println("Receipt saved successfully: " + filename);
        } catch (IOException e) {
            System.err.println("Error writing the receipt: " + e.getMessage());
        }
    }
    public String createReceipt(Order order) {
        return order.toString();
    }
}

