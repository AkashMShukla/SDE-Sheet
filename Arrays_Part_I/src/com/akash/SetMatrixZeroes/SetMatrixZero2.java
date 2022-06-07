// This is Better-Approach
package com.akash.SetMatrixZeroes;
import java.util.Arrays;
public class SetMatrixZero2 {
    public static void main(String[] args) {
        int[][] arr={
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        SetZeroes(arr);
        for(int i = 0; i < arr.length; i++){            // To Traverse over row
            for(int j = 0; j < arr[0].length; j++){     // To traverse over column of each row
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void SetZeroes(int[][] matrix){
        int row = matrix.length;                  // Size of row
        int col = matrix[0].length;               // size of column
        int[] dummy1 = new int[row];              // dummy array of the size of row
        int[] dummy2 = new int[col];              // dummy array of the size of column
        Arrays.fill(dummy1, -1);               // At start the values of all dummy1 array are -1
        Arrays.fill(dummy2, -1);               // At start the values of all dummy2 array are -1
        for(int i = 0; i < row; i++){              // To traverse over row
            for(int j = 0; j < col; j++){          // To traverse over column of each row
                if(matrix[i][j] == 0){             // If we find 0 at any index
                    dummy1[i] = 0;                 // Convert dummy1 array of i th index to 0
                    dummy2[j] = 0;                 // convert dummy2 array of j th index to 0
                }
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(dummy1[i] == 0 || dummy2[j] == 0){   // If any one of the dummy array index is 0
                    matrix[i][j] = 0;                   // Convert that index into 0
                }
            }
        }
    }
}
