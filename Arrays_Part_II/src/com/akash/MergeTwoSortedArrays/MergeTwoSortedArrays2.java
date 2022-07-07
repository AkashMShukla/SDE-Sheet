// Without using any extra array (Space)
package com.akash.MergeTwoSortedArrays;
public class MergeTwoSortedArrays2 {
    public static void main(String[] args) {
        int arr1[] = {1,4,7,8,10};
        int arr2[] = {2,3,9};
        System.out.println("Before merge:");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("After merge:");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    static void merge(int[] arr1, int[] arr2, int n, int m){
        int i, k;
        for(i = 0; i< arr1.length; i++){
            if(arr1[i] > arr2[0]){          // If element of first array > first element of second array then swap
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }
            int first = arr2[0];            // Save the first element of second array in first
            for(k = 1; k < m && arr2[k] < first; k++){
                arr2[k - 1] = arr2[k];      // put the value at k-1 position which is greater than o th index(i.e. first)
            }
            arr2[k - 1] = first;            // Then put the first at proper position(i.e. at k-1 because At k it will not satisfy above condition.
            // that means at the value of k the current value at k is > first value. Hence, we have putted first at k-1 index.
        }
    }
}
