package com.akash.FindDuplicateInArray;

import java.util.Arrays;

// Brute Force
// We are first sorting then checking the adjacent elements.
public class FindDuplicateInArray1 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(FindDuplicate(arr));
    }
    static int FindDuplicate(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);               // We are sorting here.
        for(int i = 0; i < n; i++){
            if(arr[i] == arr[i+1]){     // Here we are checking Adjacent Elements. If it is same then it is Duplicate number. Return it.
                return arr[i];
            }
        }
        return 0;
    }
}
