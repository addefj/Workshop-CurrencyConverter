package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
step 1. create class with method for printing menu
step 2. take care of user input
step 3. validate user input
step 4. create class with method for currency conversion
step 5. display result formatted
 */
        int userChoice = 0;
        boolean isValid = false;

        Menu.printMenu(); //call method for printing menu

        Scanner userInput = new Scanner(System.in); //create a scanner object to read user input



        while (!isValid) {
            try { // Check if the input can be converted to an integer
                String stringInput = userInput.nextLine(); // Store the user input into a string
                userChoice = Integer.parseInt(stringInput); // Try to parse the string to an integer
                if (userChoice == 5) {
                    System.out.println("You chose to Exit, Welcome back another time");
                    System.exit(0);
                } else if (userChoice < 1 || userChoice > 5) {
                    System.out.println("That is not a valid option, please enter 1-5.");
                    System.out.println(); //empty line for readability
                    Menu.printMenu();
                } else {
                    isValid = true; //exit the loop to continue with the next step
                }
            } catch (NumberFormatException e) {
                System.out.println("That is not a valid option, please enter 1-5.");
                System.out.println(); //empty line for readability
                Menu.printMenu();
            }
        }

        if (userChoice < 1 || userChoice > 5) {

        }
        switch (userChoice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;

        }

        userInput.close(); // Close the scanner after use


    }


}