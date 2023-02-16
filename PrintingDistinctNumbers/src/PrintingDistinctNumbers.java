/*
Author: Jakob Banta
Course: CSC260 001
Date: 10/17/19
Assignment: HW5
Instructor: Ward
This program has the user input 10 values and then displays the distinct numbers from that list
 */
import java.util.Scanner;
public class PrintingDistinctNumbers {

    // Creates a method that checks if the numbers a distinct
    public static boolean isDistinct(int[] array, int num, int count){
        for (int i = 0; i < count; i++){
            if (num == array[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){

        // Set values
        Scanner myObj = new Scanner(System.in);
        int count = 0;
        int[] a = new int[10];

        // Grabs all 10 numbers from user
        System.out.print("Enter 10 integer values: ");
        for (int i = 0; i < a.length; i++) {
            double numDouble = myObj.nextDouble();

            // Makes the input from user a integer
            Math.floor(numDouble);
            int num = (int)numDouble;


            // Checks if the numbers are distinct
            if (isDistinct(a, num, count)) {
                a[count] = num;
                count++;
            }
        }

        // Prints out all the distinct numbers
        for (int i = 0; i < count; i++){
            System.out.print(a[i] + " ");
        }
    }
}
