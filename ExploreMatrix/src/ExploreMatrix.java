/* Requests value n from the user.
   Generates an n x n matrix of random values chosen from {0,1}.
   Reports which rows, columns, and diagonals in the matrix
   have the same value throughout.
   For example, if row 2 consists of only 1's, then the message
   "All 1s on row 2" is displayed.
   Authors: Jeff Ward and <Jakob Banta>
 */

import java.util.*;

public class ExploreMatrix {
    // Note:  Do not modify the following main method.
    // Instead, modify the following method stubs so that the main
    // method works as is.
    public static void main(String[] args) {
        System.out.print("Enter the size of the matrix: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[][] matrix = randomZeroOneMatrix(n);
        printTwoDArray(matrix);
        rowChecks(matrix);
        columnChecks(matrix);
        checkMajorDiagonal(matrix);
        checkSubDiagonal(matrix);
    }

    // Check which rows have all of the same entries.
    // Display a message for each such row.
    // Display a different message if none of the rows have all the same entries.
    public static void rowChecks(int[][] matrix) {
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            int k = checkRowForSameness(matrix, i);
            if(k != -1) {
                System.out.println("All " + k + "s on row " + (i + 1));
                count++;
            }
        }
        if(count == 0)
            System.out.println("Not all same numbers on a row");
    }

    // Check which columns have all of the same entries.
    // Display a message for each such column.
    // Display a different message if none of the columns have all the same entries.
    public static void columnChecks(int[][] matrix) {
        int count = 0;
        for(int j = 0; j < matrix[0].length; j++){
            int k = checkColumnForSameness(matrix, j);
            if(k != -1) {
                System.out.println("All " + k + "s on column " + (j + 1));
                count++;
            }
        }
        if(count == 0)
            System.out.println("Not all same numbers on a column");
    }

    // Display the array values.
    public static void printTwoDArray(int[][] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Generate an nxn matrix randomly filled with zeroes and ones.
    public static int[][] randomZeroOneMatrix(int n) {
        int[][] array = new int[n][n];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
        return array; // stub
    }

    // If all values in row i are the same, then return that value.
    // Otherwise, return -1.
    public static int checkRowForSameness(int[][] matrix, int i) {
        for(int j = 0; j < matrix[i].length; j++){
            if(matrix[i][0] != matrix[i][j])
                return -1;
        }
        return matrix[i][0];
    }

    // If all values in col j are the same, then return that value.
    // Otherwise, return -1.
    public static int checkColumnForSameness(int[][] matrix, int j) {
        for(int i = 0; i < matrix.length; i++){
            if(matrix[0][j] != matrix[i][j])
                return -1;
        }
        return matrix[0][j];
    }

    // Check whether all values along the major diagonal of the matrix are the same.
    // Print a message accordingly.
    public static void checkMajorDiagonal(int[][] matrix) {
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            if (matrix[0][0] == matrix[i][i]) {
                count++;
            }
        }
        if(count == matrix.length)
            System.out.println("All " + matrix[0][0] + "s on major diagonal");
        else
            System.out.println("Not all same numbers on major diagonal");
    }

    // Check whether all values along the sub-diagonal of the matrix are the same.
    // Print a message accordingly.
    public static void checkSubDiagonal(int[][] matrix) {
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            if (matrix[0][matrix.length - 1] == matrix[i][matrix.length - 1 - i]) {
                count++;
            }
        }
        if(count == matrix.length)
            System.out.println("All " + matrix[0][matrix.length - 1] + "s on sub-diagonal");
        else
            System.out.println("Not all same numbers on sub-diagonal");
    }
}
