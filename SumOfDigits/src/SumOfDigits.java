/*
Author: Jakob Banta
Course: CSC260 001
Date: 9/26/19
Assignment: HW4
Instructor: Ward
This program computes the sum of the digits of an integer
 */
import java.util.Scanner;

// Creates the method to get the sum of all the digits
public class SumOfDigits {
    public static int sumDigits(long n){
        long i = Math.abs(n);
        int sum = 0;

        while (i > 0){
            sum += (i % 10);
            i /= 10;
        }
        return sum;
    }

    // Get users input for an integer
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = num.nextLong();

        // Outputs the sum of the digits of an integer
        System.out.print("The sum of the digits is " + sumDigits(n));

    }
}
