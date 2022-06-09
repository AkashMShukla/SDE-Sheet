// This is Optimised better Approach
package com.akash.SetMatrixZeroes;
public class SetMatrixZero3 {
    public static void main(String args[]) {
        int arr[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        SetZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void SetZeroes(int[][] matrix){
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0){
                col0 = 0; // We will check for every first column of each row. Is anyone of them will be 0.
            }
            // Then we will update it in col0 = 0, so that we can change this first column of each row to 0. Because we can't change it
            // when we are traversing backward
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }
        for(int i = rows - 1; i >= 0; i--){
            for(int j = cols - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)     // Check if first row or first column of that index is 0
                    matrix[i][j] = 0;
            }
            if (col0 == 0){                 // If first column of each row is 0 then make it zero.
                matrix[i][0] = 0;           // If we don't take this col0 condition our output will fail.
            }
        }
    }
}

