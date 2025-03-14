package se.lexicon;

public class Main {
    public static void main(String[] args) {
       /*
step 1. create class with method for printing menu
step 2. take care of user input
step 3. validate user input
step 4. create class with method for currency conversion
step 5. create method for displaying result formatted
 */

        int userChoice = UserInputValidation.isMenuInputValid(); //ask user for menu choice and validate the input
        ExchangeOperation.exchangeCurrency(userChoice); //call method for exchanging currency

    }
}