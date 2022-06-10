package com.akash.PascalTriangle;
import java.util.ArrayList;
import java.util.List;
public class Pascaltriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    static List<List<Integer>> generate(int NumOfRows) {        // We are returning list inside list hence return type is list<list<
        List<List<Integer>> Final = new ArrayList<List<Integer>>(); // Creating Array List which will save Final list. storing list inside list
        List<Integer> Previous = new ArrayList<Integer>();     // Creating two array list which will save current & previous list. Keep value null.
        //List<Integer> Previous = null;                       // OR we can use this also
        for (int i = 0; i < NumOfRows; i++) {       // Traversing in rows
            List<Integer> Current = new ArrayList<Integer>();     // For Each row we are having different Current List. Therefore, On every new line we are having new current list.
            for (int j = 0; j <= i; j++) {          // Traversing in column of each row
                if (j == 0 || j == i) {             // If we are at edge
                    Current.add(1);                 // Add value 1
                } else {
                    Current.add(Previous.get(j - 1) + Previous.get(j));     //Else add sum of previous list's j-1 & j values
                }
            }
            Previous = Current;                     // Store the current list to previous list so that we can use it in next list
            Final.add(Current);                     // For every loop Save the current list in Final list. so that after all done. we can print it.
        }
        return Final;
    }
}