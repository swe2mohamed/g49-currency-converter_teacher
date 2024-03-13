package se.lexicon;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeApp {


    // Step1: Define the main method
    // Step2: Create Scanner
    // Step3: Add a Loop to repeatedly display the menu
    // Step4: Get the user's choice from the scanner
    // Step5: Implement the converter operations(Exchange Operations)
    // Step6: Perform operations based on the user's choice using thr switch-case statement
    // Step7: Display output
    // Step8: Continue the loop as long as user's choice is not 0

    // mainMethod
    // printMenu
    // getUserInput
    // performOperations


    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int choice; // declare a variable
        do {
            // ClassName.methodName
            printMenu();
            // initialize a variable
            choice = scanner.nextInt();
            performOperations(choice);
        } while (choice != 0);

    }


    private static void printMenu() {
        System.out.println("Currency Converter App:");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    }


    private static void performOperations(int choice) {
        Scanner scanner = new Scanner(System.in);
        double sekAmount, usdAmount;
        switch (choice) {
            case 1:
                sekAmount = getAmount("SEK");
                usdAmount = ExchangeOperations.convertSEKToUSD(sekAmount);
                printConversionResult(sekAmount, usdAmount, "SEK", "USD");
                break;
            case 2:
                usdAmount = getAmount("USD");
                sekAmount = ExchangeOperations.convertUSDToSEK(usdAmount);
                printConversionResult(usdAmount, sekAmount, "USD", "SEK");
                break;
            case 3:
                //todo: call convertSekToEuro method
                break;
            case 4:
                //todo: call convertEuroToSek method
                break;
            case 0:
                System.out.println("Exiting the currency converter app. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private static double getAmount(String currency) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in " + currency + ": ");
        double amount = scanner.nextDouble();
        return amount;
    }


    private static void printConversionResult(
            double fromAmount,
            double toAmount,
            String fromCurrency,
            String toCurrency
    ) {


        System.out.println(fromAmount + " " + fromCurrency + " is equal to " + ExchangeOperations.formatNumber(toAmount) + " " + toCurrency);
    }


}
