package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputValidation {
    /*
    public static void isMenuInputValid() {
    }
*/
    public static double amountToAdd(String currencyIn, String currencyOut, double exchangeRate) {

        Scanner userInput = new Scanner(System.in); //create scanner object for user input

        while (true) { //ask for amount to exchange until user enters a valid amount
            try { //try that the user input is valid
                ExchangeUI.displayExchangeRateMenu(currencyIn, currencyOut, exchangeRate); //display exchange rate menu
                double amountIn = userInput.nextDouble();
                if (amountIn <= 0) {
                    ExchangeUI.displayInvalidAmountMessage(); //display in case of invalid user entry
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


