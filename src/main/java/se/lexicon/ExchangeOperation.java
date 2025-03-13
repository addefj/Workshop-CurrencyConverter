package se.lexicon;

import java.util.Scanner;

public class ExchangeOperation {

    public static void exchangeCurrency(int input) {

        Scanner userInput = new Scanner(System.in); //create scanner object to read user input

        //declaring variables
        double amountIn;
        double amountOut;

        switch (input) {
            case 1: //sek to usd
                ExchangeUI.displayExchangeRateMenu("SEK", "USD", ExchangeRates.SEK_TO_USD);
                amountIn = userInput.nextInt();
                amountOut = amountIn * ExchangeRates.SEK_TO_USD;
                ExchangeUI.displayExchangeResult(amountIn, amountOut, "SEK", "USD");
                break;

            case 2://usd to sek
                ExchangeUI.displayExchangeRateMenu("USD", "SEK", ExchangeRates.USD_TO_SEK);
                amountIn = userInput.nextInt();
                amountOut = amountIn * ExchangeRates.USD_TO_SEK;
                ExchangeUI.displayExchangeResult(amountIn, amountOut, "USD", "SEK");
                break;

            case 3://sek to euro
                ExchangeUI.displayExchangeRateMenu("SEK", "EURO", ExchangeRates.SEK_TO_EURO);
                amountIn = userInput.nextInt();
                amountOut = amountIn * ExchangeRates.SEK_TO_EURO;
                ExchangeUI.displayExchangeResult(amountIn, amountOut, "SEK", "EURO");
                break;

            case 4://euro to sek
                ExchangeUI.displayExchangeRateMenu("EURO", "SEK", ExchangeRates.EURO_TO_SEK);
                amountIn = userInput.nextInt();
                amountOut = amountIn * ExchangeRates.EURO_TO_SEK;
                ExchangeUI.displayExchangeResult(amountIn, amountOut, "EURO", "SEK");
                break;
        }
    }
}
