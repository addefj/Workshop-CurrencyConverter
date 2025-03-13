package se.lexicon;

public class ExchangeUI {

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

    public static void displayInvalidOptionMessage(){
        System.out.println("That is not a valid option, Try again.");
        System.out.println(); //empty line for readability
    }

    public static void displayExitMessage() {
        System.out.println("You chose to Exit, Welcome back another time");
    }

    public static void displayExchangeRateMenu(String currencyIn, String currencyOut, double exchangeRate) {
        System.out.println("-----------------------------------------");
        System.out.println("You chose to exchange " + currencyIn + " for " + currencyOut);
        System.out.println("Exchange rate: 1 " + currencyIn + " = " + exchangeRate);
        System.out.println("------------------------------------------");
        System.out.println("Enter amount of " + currencyIn + " to exchange:");
    }

    public static void displayExchangeResult(double amountIn, double amountOut, String currencyIn, String currencyOut) {
        System.out.println("You exchanged " + amountIn + " " + currencyIn + " to " + amountOut + " " + currencyOut);
    }
}

