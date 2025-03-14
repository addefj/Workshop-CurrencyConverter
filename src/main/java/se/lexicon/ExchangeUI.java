package se.lexicon;

public class ExchangeUI {

    //main menu message
    public static void printMenu() {
        System.out.println("=========================================");
        System.out.println("Welcome to my Currency Exchange App:");
        System.out.println("-----------------------------------------");
        System.out.println("Enter option 1-4, or 0 to Exit");
        System.out.println("-----------------------------------------");
        System.out.println("1. Exchange SEK to USD");
        System.out.println("2. Exchange USD to SEK");
        System.out.println("3. Exchange SEK to EURO");
        System.out.println("4. Exchange EURO to SEK");
        System.out.println("0. Exit");
        System.out.println("=========================================");
        System.out.println("Please enter your choice:");
    }

    //message to display in case of invalid menu option input
    public static void displayInvalidOptionMessage(){
        System.out.println("That is not a valid option, Try again.");
        System.out.println(); //empty line for readability
    }

    //message to display in case of invalid amount input
    public static void displayInvalidAmountMessage(){
        System.out.println("That is not a valid amount, Try again.");
        System.out.println(); //empty line for readability
    }

    //message to display if user choses to exit app
    public static void displayExitMessage() {
        System.out.println("You chose to Exit, Welcome back another time");
    }

    //exchange rate menu to display after user chooses option in main menu
    public static void displayExchangeRateMenu(String currencyIn, String currencyOut, double exchangeRate) {
        System.out.println("-----------------------------------------");
        System.out.println("You chose to exchange " + currencyIn + " for " + currencyOut);
        System.out.println("Exchange rate: 1 " + currencyIn + " = " + exchangeRate);
        System.out.println("------------------------------------------");
        System.out.println("Enter amount of " + currencyIn + " to exchange:");
    }

    //message to display as result after exchange is performed
    public static void displayExchangeResult(double amountIn, double amountOut, String currencyIn, String currencyOut) {
        System.out.printf("You exchanged: %.2f %s to: %.2f %s", amountIn, currencyIn, amountOut, currencyOut);
    }
}

