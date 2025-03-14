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


        Scanner userInput = new Scanner(System.in); //create a scanner object to read user input

        int userChoice = UserInputValidation.isMenuInputValid();
        ExchangeOperation.exchangeCurrency(userChoice); //call method for exchanging currency

        userInput.close(); // Close the scanner after use
    }
}