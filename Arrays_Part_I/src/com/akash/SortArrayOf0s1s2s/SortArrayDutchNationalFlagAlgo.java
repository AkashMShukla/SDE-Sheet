package com.akash.SortArrayOf0s1s2s;
import java.util.Arrays;
// Three pointer Approach. We are using low, mid & high as three pointers in this case.
// This is a variation of the popular Dutch National Flag Algorithm
public class SortArrayDutchNationalFlagAlgo {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,2,2,2,2,1,1,0,0,2,1,1,1,2};
        SortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SortArray(int[] arr){
        int low = 0;                // Keep low to first index
        int mid = 0;                // Keep mid at first index
        int high = arr.length - 1;  // Make high to Last index
        while(mid <= high){            // While mid is <= high
            switch(arr[mid]){          // Make switch which will take value at mid.
                case 0:{                // If mid is 0
                    int temp = arr[low];    // Swap mid with low
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;                   // Increase mid by 1
                    low++;                   // Increase low by 1
                    break;
                }
                case 1:{                // If mid is 1
                    mid++;              // Increase mid by 1
                    break;
                }
                case 2:{                // If mid is 2
                    int temp = arr[high];       // Swap mid with high
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;             // Decrease high by 1
                    break;
                }
            }
        }
    }
}
