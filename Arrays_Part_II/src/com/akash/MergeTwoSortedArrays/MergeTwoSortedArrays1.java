// Merging two sorted arrays using one extra array.
package com.akash.MergeTwoSortedArrays;
import java.util.Arrays;
public class MergeTwoSortedArrays1 {
    public static void main(String[] args) {
        int[] arr1 = {1,4,7,8,10};
        int[] arr2 = {2,3,9};
        System.out.println("Before merging :");
        for(int i = 0; i < arr1.length;i++){
            System.out.print(arr1[i] + " ");        // Printing first array before merging
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");        // Printing second array before merging
        }
        System.out.println();
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("After merging :");
        for(int i = 0;i< arr1.length; i++){
            System.out.print(arr1[i] + " ");        // Printing first array after merging
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");        // Printing second array after merging
        }
    }
    static void merge(int[] arr1, int[] arr2, int n, int m){
        int[] arr3 = new int[n + m];                // Size of extra array will be = size of arr1 & arr2
        int k = 0;
        for(int i = 0; i < arr1.length; i++){       // Iterate till size of arr1
            arr3[k++] = arr1[i];                    // Taking all the values of arr1 to arr3
        }
        for(int i = 0;i < arr2.length; i++){        // Iterate till size of arr2
            arr3[k++] = arr2[i];                    // Taking all the values of arr2 to arr3
        }
        Arrays.sort(arr3);                          // Sorting arr3
        k = 0;
        for(int i = 0 ; i < arr1.length; i++){      // we are putting values in arr1 only till the size of arr1
            arr1[i] = arr3[k++];                    // Putting values of arr3 back to arr1
        }
        for(int i = 0 ; i < arr2.length; i++){      // we are putting values in arr1 only till the size of arr2
            arr2[i] = arr3[k++];                    // Putting values of arr3 back to arr2
        }
    }
}
