package com.akash.KadanesAlgorithm;
import java.util.ArrayList;
// Best Approach
// msf – max so far.
// meh – max end here.
// start – to get the starting index of ans’s sub-array.
// end – to get the ending index of ans’s sub-array.
public class MaxSubArraySumUsingKadanesAlgo {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        ArrayList<Integer> subarray = new ArrayList<>();
        int ans = maxsubArray(arr, subarray);
        System.out.println("The longest sub-array with maximum sum is "+ans);
        System.out.println("The sub-array is ");
        for(int i = subarray.get(0);i <= subarray.get(1); i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int maxsubArray(int[] num, ArrayList<Integer> subarray){
        int msf = num[0];       // consider first number is your maximum number
        int meh = 0;            // Make current to 0
        int s = 0;              // To get start index of sub-array
        for(int i = 0; i < num.length; i++){
            meh += num[i];      // we are adding each element one by one to current.
            if(meh > msf){      // If current is > Max element
                subarray.clear();
                msf = meh;      // Make current to max
                subarray.add(s);    // Add that index to sub-array
                subarray.add(i);    // i is used to get last index of sub-array
            }
            if(meh < 0){            // If current index < 0
                meh = 0;            // Reset current to 0
                s = i + 1;          // Increase the start index by 1
            }
        }
        return msf;                 // Return max index
    }
}
