//Same as previous code. Only removed the third k loop
// Better Approach
package com.akash.KadanesAlgorithm;
import java.util.ArrayList;
public class MaxSubArraySum2 {
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
    static int maxsubArray(int[] num, ArrayList<Integer> subarray) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < num.length; j++) {
                curr_sum += num[j];
                if (curr_sum > max_sum) {
                    subarray.clear();
                    max_sum = curr_sum;
                    subarray.add(i);
                    subarray.add(j);
                }
            }
        }
        return max_sum;
    }
}
