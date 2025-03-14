package se.lexicon;

public class Main {
    public static void main(String[] args) {
       /*
step 1. create class with methods for displaying menus, and exchange results
    1.1 main menu
    1.2 exchange menu
    1.3 error messages
    1.4 Exit message
    1.5 formatted result
step 2. create class exchange rates
step 3. create class with method for currency conversion
    3.1 switch for performing different menu options
step 4. create class with methods for inputs and validations
    4.1 input, read and validate main menu input
    4.2 input, read and validate amount input
step 5. Optional improvements
    5.1 option to return to main menu
 */

        int userChoice = UserInputValidation.isMenuInputValid(); //ask user for menu choice and validate the input
        ExchangeOperation.exchangeCurrency(userChoice); //call method for exchanging currency
    }
}