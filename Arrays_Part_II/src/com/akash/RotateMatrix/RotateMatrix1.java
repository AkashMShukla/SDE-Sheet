package src.com.akash.RotateMatrix;
import java.util.ArrayList;
import java.util.Arrays;
public class RotateMatrix1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] ans = rotate(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr.length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] rotate(int[][] matrix){
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return rotated;
    }
}