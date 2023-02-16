/*
Author: Jakob Banta
Course: CSC260 001
Date: 9/19/19
Assignment: HW3
Instructor: Ward
This program displays a number triangle for the number 6
 */

public class NumberTrianglePattern3 {
    public static void main(String[] args) {

        // Prints Pattern III
        System.out.println("Pattern III");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
