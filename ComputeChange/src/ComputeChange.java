/*
Jakob Banta
CSC 260 001
9/4/19
Assignment #2
Ward

This program outputs the change of an amount you put in
 */
import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        //int remainingAmount = (int)(amount * 100); // Rounding error if amount is 10.03
        int remainingAmount = (int)Math.round(amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        if (amount > 0.0) {
            System.out.printf("Your amount $%,1.2f" + " consists of \n", amount);

            //Display Dollars
            if (numberOfOneDollars == 0) ;
            else if (numberOfOneDollars == 1)
                System.out.print("\t" + numberOfOneDollars + " dollar\n");
            else
                System.out.print("\t" + numberOfOneDollars + " dollars\n");

            //Display Quarters
            if (numberOfQuarters == 0) ;
            else if (numberOfQuarters == 1)
                System.out.print("\t" + numberOfQuarters + " quarter\n");
            else
                System.out.print("\t" + numberOfQuarters + " quarters\n");

            //Display Dimes
            if (numberOfDimes == 0) ;
            else if (numberOfDimes == 1)
                System.out.print("\t" + numberOfDimes + " dime\n");
            else
                System.out.print("\t" + numberOfDimes + " dimes\n");

            //Display Nickels
            if (numberOfNickels == 0) ;
            else if (numberOfNickels == 1)
                System.out.print("\t" + numberOfNickels + " nickel\n");
            else
                System.out.print("\t" + numberOfNickels + " nickels\n");

            //Display Pennies
            if (numberOfPennies == 0) ;
            else if (numberOfPennies == 1)
                System.out.print("\t" + numberOfPennies + " penny\n");
            else
                System.out.print("\t" + numberOfPennies + " pennies\n");
        }
        else
            System.out.printf("Your amount $%,1.2f" + " consists of no change", amount);
        input.close();
    }
}
