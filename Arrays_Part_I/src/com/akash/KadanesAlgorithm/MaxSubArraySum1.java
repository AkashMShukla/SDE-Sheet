package com.akash.KadanesAlgorithm;
import java.util.ArrayList;
public class MaxSubArraySum1 {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        ArrayList<Integer> subarray = new ArrayList<Integer>();
        int ans = maxsubArray(arr, subarray);
        System.out.println("The longest sub-array with maximum sum is : " + ans);
        System.out.print("The sub-array is : ");
        for(int i = subarray.get(0); i <= subarray.get(1); i++){    //we are finding start & last index by calling them.
            System.out.print(arr[i] + " ");
        }
    }
    static int maxsubArray(int[] num, ArrayList<Integer> subarray){
        int max_sum = 0;
        int n = num.length;
        if(n == 1){         // If array contains only one element return that element
            return num[0];
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                int sum = 0;
                for(int k = i;k <= j; k++){     // we will check from i to j
                    sum = sum + num[k];         // Updating sum value till k th index
                    if(sum > max_sum){          // If sum > maximum sum
                        subarray.clear();
                        max_sum = sum;          // Update the value of maximum sum to sum
                        subarray.add(i);        // Add i to sub-array
                        subarray.add(j);        // Add j to sub-array
                    }
                }
            }
        }
        return max_sum;
    }
}
