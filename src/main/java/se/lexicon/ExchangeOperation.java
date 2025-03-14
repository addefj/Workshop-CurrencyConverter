package se.lexicon;

public class ExchangeOperation {

    public static void exchangeCurrency(int input) {

        //declaring variables
        double amountIn;
        double amountOut;

        switch (input) {
            case 1: //sek to usd
                amountIn = UserInputValidation.amountToExchange("SEK", "USD", ExchangeRates.SEK_TO_USD); //call method for user input
                amountOut = amountIn * ExchangeRates.SEK_TO_USD; //perform exchange calculation
                ExchangeUI.displayExchangeResult(amountIn, amountOut, "SEK", "USD"); //display exchange result
                break;

            case 2: //usd to sek
                amountIn = UserInputValidation.amountToExchange("USD", "SEK", ExchangeRates.USD_TO_SEK); //call method for user input
                amountOut = amountIn * ExchangeRates.USD_TO_SEK; //perform exchange calculation
                ExchangeUI.displayExchangeResult(amountIn, amountOut, "USD", "SEK"); //display exchange result
                break;

            case 3: //sek to euro
                amountIn = UserInputValidation.amountToExchange("SEK", "EURO", ExchangeRates.SEK_TO_EURO); //call method for user input
                amountOut = amountIn * ExchangeRates.SEK_TO_EURO; //perform exchange calculation
                ExchangeUI.displayExchangeResult(amountIn, amountOut, "SEK", "EURO"); //display exchange result
                break;

            case 4: //euro to sek
                amountIn = UserInputValidation.amountToExchange("EURO", "SEK", ExchangeRates.EURO_TO_SEK); //call method for user input
                amountOut = amountIn * ExchangeRates.EURO_TO_SEK; //perform exchange calculation
                ExchangeUI.displayExchangeResult(amountIn, amountOut, "EURO", "SEK"); //display exchange result
                break;
        }
    }
}
