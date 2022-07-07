package com.akash.FindDuplicateInArray;
// This is the most Optimal Solution. We are using Linked List Cycle Method.
// This is called Tortoise Method. We are using two pointers. We are moving slow pointer by 1 & fast pointer by 2.
public class FindDuplicateInArray3 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(FindDuplicate(arr));
    }
    static int FindDuplicate(int[] arr){
        int slow = arr[0];      // Assume slow is at first position.
        int fast = arr[0];      // Assume fast is at first position.
        do{
            slow = arr[slow];   // We are moving slow by 1 in our Linked list cycle.
            fast = arr[arr[slow]];  // We are moving fast by 2 in our Linked list cycle.
        }while(slow != fast);       // While slow & fast are not equal
        fast = arr[0];              // After that again we move the fast to first index.
        while(slow != fast){        // while fast != slow
            slow = arr[slow];       // We will move slow by 1
            fast = arr[fast];       // We will move fast by 1
        }
        return slow;        // We can return slow or fast because at last both will be same.
    }
}
