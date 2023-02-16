/*
Author: Jakob Banta
Course: CSC260 001
Date: 9/19/19
Assignment: HW3
Instructor: Ward
This program displays a number triangle for the number 6
 */

public class NumberTriangle {
    public static void main(String[] args) {

        // Prints Pattern I
        System.out.println("Pattern I");
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Prints Pattern II
        System.out.println("Pattern II");
        for (int i = 6; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


        // Prints Pattern III
        System.out.println("Pattern III");
        for (int i = 1; i <= 6; i++){
            for (int j = 6; j > i; j--){
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Print Pattern IV
        System.out.println("Pattern IV");
        for (int i = 6; i >= 1; i--){
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
