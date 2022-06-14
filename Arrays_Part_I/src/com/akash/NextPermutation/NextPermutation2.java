package com.akash.NextPermutation;
import java.util.Arrays;
public class NextPermutation2 {
    public static void main(String[] args) {
        int[] A = {1,3,5,4,2};
        System.out.println(Arrays.toString(Nextpermutation(A)));
    }
    static int[] Nextpermutation(int[] A){
        if(A == null || A.length <= 1){         //If the array is 1 or Null then return array itself
            return A;
        }
        int i = A.length - 2;       // We will keep i value to A.length - 2.
        while(i >= 0 && A[i] >= A[i + 1]){  // We have to find the breakpoint i.e. A[i] > A[i+1]
            i--;
        }
        if(i >= 0){
            int j = A.length - 1;   // Keep j value to last value.
            while(A[j] <= A[i]){    // we have to find the index where A[j] > A[i]
                j--;
            }
            swap(A,i,j);        // Swap the values present at i & j index.
        }
        reverse(A, i + 1, A.length - 1);    // Reverse everything to the right of index i + 1
        return A;                               // We are returning array because we need to return array.
    }
    static void swap(int[] A,int i, int j){     // Swapping elements
        int temp = A[i];
        A[i] = A[j];
        A[j]  = temp;
    }
    static void reverse(int[] A, int i, int j){
        while(i < j){                            // We have to swap elements till i < j
            swap(A, i++,j--);
        }
    }
}
