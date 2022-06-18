package com.akash.NextPermutation;
import java.util.ArrayList;
import java.util.Arrays;

public class NextPermutation2usingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList(1, 3, 5, 4, 2));
        ArrayList<Integer> ans = nextPermutation(numbers);
        System.out.println(ans);
    }
    static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation){
        if(permutation == null || permutation.size() <= 1){         //If the array is 1 or Null then return array itself
            return permutation;
        }
        int i = permutation.size() - 2;       // We will keep i value to A.length - 2.
        while(i >= 0 && permutation.get(i) >= permutation.get(i + 1)){  // We have to find the breakpoint i.e. A[i] > A[i+1]
            i--;
        }
        if(i >= 0){
            int j = permutation.size() - 1;   // Keep j value to last value.
            while(permutation.get(j) <= permutation.get(i)){    // we have to find the index where A[j] > A[i]
                j--;
            }
            swap(permutation,i,j);        // Swap the values present at i & j index.
        }
        reverse(permutation, i + 1, permutation.size() - 1);    // Reverse everything to the right of index i + 1
        return permutation;                               // We are returning array because we need to return array.
    }
    static void swap(ArrayList<Integer> permutation, int i, int j){     // Swapping elements
        int temp = permutation.get(i);
        permutation.set(i, permutation.get(j));
        permutation.set(j, temp);
    }
    static void reverse(ArrayList<Integer> permutation, int i, int j){
        while(i < j){                            // We have to swap elements till i < j
            swap(permutation, i++,j--);
        }
    }
}
