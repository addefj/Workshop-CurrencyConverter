package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputValidation {

    public static int isMenuInputValid(String userInputString) {

        try { // Check if the input can be converted to an integer
            return Integer.parseInt(userInputString); // Store the user input into a string
        } catch (NumberFormatException e) { //catch invalid user entry
            ExchangeUI.displayInvalidOptionMessage(); //display message in case of invalid user entry
            Main.mainMenu(); //go back to main menu for new input
        }
        return 0;
    }

    //method for reading user input for amount and validate
    public static double amountToAdd(String currencyIn, String currencyOut, double exchangeRate) {

        Scanner userInput = new Scanner(System.in); //create scanner object for user input

        while (true) { //ask for amount to exchange until user enters a valid amount
            try { //try that the user input is valid
                ExchangeUI.displayExchangeRateMenu(currencyIn, currencyOut, exchangeRate); //display exchange rate menu
                double amountIn = userInput.nextDouble();
                if (amountIn < 0) {
                    ExchangeUI.displayInvalidAmountMessage(); //display in case of invalid user entry
                } else if (amountIn == 0) {
                    Main.mainMenu(); //go back to main menu
                } else {
                    return amountIn;
                }
            } catch (InputMismatchException e) { //catch invalid user entry
                ExchangeUI.displayInvalidAmountMessage(); //display message in case of invalid user entry
                userInput.next(); //clears scanner buffer
            }
        }
    }
}


