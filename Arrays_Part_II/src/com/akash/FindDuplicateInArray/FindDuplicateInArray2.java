package com.akash.FindDuplicateInArray;
// Optimizing Brute Force Approach
// Using frequency Array.(Using one more array)
// We are counting if the frequency is not zero (i.e . it is 1) then we got our duplicate number.
public class FindDuplicateInArray2 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr){
        int n = arr.length;
        int[] Frequency= new int[n + 1];    //Here we are using new array. By, default the values are 0.
        for(int i =0; i < n; i++){
            if(Frequency[arr[i]] == 0){     // We are going to that index & checking If The value is 0 then we are incrementing the count in that index by 1.
                Frequency[arr[i]] += 1;
            }else{                          // If the value is not 0 i.e. it is 1 then it shows the number is occured again. so return it.
                return arr[i];
            }
        }
        return 0;
    }
}
