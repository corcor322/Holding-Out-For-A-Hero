# Holding Out For A Hero
//TODO: Resources and screenshots
## Description of the Project

This java application is a Sandwich shop. It allows the customer to order sandwiches and customize the bread, size, and toppings.
The customer can add multiple sandwiches, drinks, and chips to their order. Checking out will leave them with a receipt of the date
 and time of their purchase and the items they've ordered.

## User Stories

These are the user stories that guided me through development:

- As a customer, I want to be able to order sandwiches, drinks, and chips so that I can eat yummy food.
- As a customer, I want a clear and navigable order screen so that using the applications is intuitive.
- As a customer, I want to be able to define bread choice and toppings to further customize my order.
- As a customer, I want to be able to add multiple sandwiches and drinks to the same order so that I can treat my friends.
- As a customer, I want the ability to cancel my order and go back to the home screen so that I am not locked into a purchase I no longer want.
- As a customer, I want to confirm the price and details of my order before payment to ensure I get what I want.
- As a customer, I want a receipt with the date and time of my purchase on it so I can track my expenses.

## Setup

Instructions on how to set up and run the project using IntelliJ IDEA.

### Prerequisites

- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the `public static void main(String[] args)` method. This is in the class titled "Main".
5. Right-click on the file and select 'Run 'Main.main()'' to start the application.

## Technologies Used

- Java: Java 17


## Demo

Here are some screenshots of the program in action:

![Main Menu](src/main/resources/mainMenu.png)
![Add Deposit](src/main/resources/addDeposit.png)
![Invalid Format](src/main/resources/invalidFormat.png)
![Ledger Menu](src/main/resources/ledgerMenu.png)
![Reports](src/main/resources/reports.png)

## Future Work

Additional work that could be done with this project:
- Customer profiles tracking email or phone number and offering discounts to repeat customers after they spend a certain amount
- Adding a GUI
- More options for sandwich customization
- Applying a discount when a combo is ordered
- Adding signature sandwiches and giving each one a name pun
- Expanding sides to include fresh fruit, fries, or a pickle

## Resources

In addition to the material covered in class, the following tutorials and documentation were a great help to me:

- [Java Create and Write to Files](https://www.w3schools.com/java/java_files_create.asp)
- [Java Time LocalDate Class](https://www.tutorialspoint.com/javatime/javatime_localdate.htm)
- [Temporal Adjuster](https://docs.oracle.com/javase/tutorial/datetime/iso/adjusters.html)
- [Compare Two LocalDate Instances in Java](https://howtodoinjava.com/java/date-time/compare-localdates/#:~:text=LocalDate%20equals()%20Method,can%20use%20equals()%20method.)


## Team Members

- Corrie Salerno-Brazell: Sole developer


## Thanks


- Many thanks to Raymond, my Java bootcamp instructor, for being on standby to help with issues in my code.
- Thanks to Aaron for help on the checkOut method.
- Special thanks to Cameron for taking time to review my code and guide me through the price method overrides.