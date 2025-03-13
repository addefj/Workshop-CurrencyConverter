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

    public static void displayInvalidOption(){
        System.out.println("That is not a valid option, Try again.");
        System.out.println(); //empty line for readability
    }

    public static void displayExitMessage() {
        System.out.println("You chose to Exit, Welcome back another time");
    }

    public static void displaySekToUsdMenu() {
        System.out.println("-----------------------------------------");
        System.out.println("You chose to exchange SEK for USD");
        System.out.println("Exchange rate: 1 SEK = " + ExchangeRates.SEK_TO_USD);
        System.out.println("------------------------------------------");
        System.out.println("Enter amount of SEK to exchange:");
    }

    public static void displayUsdToSekMenu() {
        System.out.println("------------------------------------------");
        System.out.println("You chose to exchange USD for SEK");
        System.out.println("Exchange rate: 1 USD = " + ExchangeRates.USD_TO_SEK);
        System.out.println("------------------------------------------");
        System.out.println("Enter amount of USD to exchange:");
    }

    public static void displaySekToEuroMenu() {
        System.out.println("------------------------------------------");
        System.out.println("You chose to exchange SEK for EURO");
        System.out.println("Exchange rate: 1 SEK = " + ExchangeRates.SEK_TO_EURO);
        System.out.println("------------------------------------------");
        System.out.println("Enter amount of SEK to exchange:");
    }

    public static void displayEuroToSekMenu() {
        System.out.println("------------------------------------------");
        System.out.println("You chose to exchange EURO for SEK");
        System.out.println("Exchange rate: 1 EURO = " + ExchangeRates.EURO_TO_SEK);
        System.out.println("------------------------------------------");
        System.out.println("Enter amount of EURO to exchange:");
    }

    public static void displayExchangeResult(double amountIn, double amountOut, String currencyIn, String currencyOut) {
        System.out.println("You exchanged " + amountIn + " " + currencyIn + " to " + amountOut + " " + currencyOut);
    }
}

