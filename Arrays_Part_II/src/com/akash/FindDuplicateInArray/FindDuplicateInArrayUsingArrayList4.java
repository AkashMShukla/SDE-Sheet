package com.akash.FindDuplicateInArray;
import java.util.ArrayList;
import java.util.Arrays;
// CodeStudio Solution
// My output is not showing. I need to check this later on.
public class FindDuplicateInArrayUsingArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,3,4,2,2));
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(ArrayList<Integer> arr){
        // Write your code here.
        int slow = arr.get(0);
        int fast = arr.get(0);
        do{
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
        }while(slow != fast);
        fast = arr.get(fast);
        while(slow != fast){
            slow = arr.get(slow);
            fast = arr.get(fast);
        }
        return slow;
    }
}
