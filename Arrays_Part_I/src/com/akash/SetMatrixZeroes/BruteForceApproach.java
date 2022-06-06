package com.akash.SetMatrixZeroes;
public class BruteForceApproach {
    public static void main(String[] args) {
        int arr[][]={
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        SetZeroes(arr);
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    static void SetZeroes(int[][] matrix){
         int rows = matrix.length;  // Number of Rows
         int cols = matrix[0].length;   // Number of Columns
         for(int i = 0; i < rows; i++){ //First Iterate over each row
             for(int j = 0;j < cols;j++){   // Check each column of each row
                 if(matrix[i][j] == 0){     // If we find 0 in row

                    int index = i - 1;      // Decrement i to check the upper side of the 0. Now We will traverse through column
                    while(index >= 0) {     // Upper side must be >= 0
                        if (matrix[index][j] != 0) {    // This must be non-zero
                            matrix[index][j] = -1;      // Make it as -1
                        }
                        index--;                        // Decrement the index
                    }
                    index = i + 1;                      // Increment i to check Below side of the 0
                    while(index < rows){                // This must be < rows(size of matrix)
                        if(matrix[index][j] != 0){      // This must be non-zero
                            matrix[index][j] = -1;      // Make it as -1
                        }
                        index++;                        // Increment the index
                    }
                    index = j - 1;                      // Decrement j to check the left side of 0. Now We will traverse through row.
                    while(index >= 0){
                        if(matrix[i][index] != 0){      // This must be non-zero
                            matrix[i][index] = -1;      // Make it as -1
                        }
                        index--;                        // Decrement the index
                    }
                    index = j + 1;                      // Increment j to check the right side of 0.
                    while(index < cols){
                        if(matrix[i][index] != 0){      // This must be non-zero
                            matrix[i][index] = -1;      // Make it as -1
                        }
                        index++;                        // Increment the index
                    }
                 }
             }
         }
         for(int i = 0; i < rows; i++){
             for(int j = 0; j < cols; j++){
                 if(matrix[i][j] <= 0){                 // If element is <= 0
                     matrix[i][j] = 0;                  // Make it as 0
                 }
             }
         }
    }
}
