/*
Author: Jakob Banta
Course: CSC260 001
Date: 9/19/19
Assignment: HW3
Instructor: Ward
This program displays a number triangle for the number 6
 */

public class NumberTrianglePattern4 {
    public static void main(String[] args) {

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
