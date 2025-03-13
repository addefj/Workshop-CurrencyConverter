package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
step 1. create class with method for printing menu
step 2. take care of user input
step 3. validate user input
step 4. create class with method for currency conversion
step 5. create method for displaying result formatted
 */

        int userChoice = 0;
        boolean isValid = false;

        Scanner userInput = new Scanner(System.in); //create a scanner object to read user input

        while (!isValid) { //continue running until user enters a valid input
            ExchangeUI.printMenu(); //call method for printing menu
            try { // Check if the input can be converted to an integer
                String stringInput = userInput.nextLine(); // Store the user input into a string
                userChoice = Integer.parseInt(stringInput); // Try to parse the string to an integer
                if (userChoice == 0) {
                    ExchangeUI.displayExitMessage();
                    System.exit(0);
                } else if (userChoice < 0 || userChoice > 4) {
                    ExchangeUI.displayInvalidOption();
                } else {
                    isValid = true; //exit the loop to continue with the next step
                }
            } catch (NumberFormatException e) {
                ExchangeUI.displayInvalidOption();
            }
        }

        ExchangeOperation.exchangeCurrency(userChoice); //call method for exchanging currency

        userInput.close(); // Close the scanner after use
    }
}