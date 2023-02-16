/*
Author: Jakob Banta
Course: CSC260 001
Date: 9/19/19
Assignment: HW3
Instructor: Ward
This program displays a number triangle for the number 6
 */

public class NumberTrianglePattern2 {
    public static void main(String[] args) {

        // Prints Pattern II
        System.out.println("Pattern II");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}