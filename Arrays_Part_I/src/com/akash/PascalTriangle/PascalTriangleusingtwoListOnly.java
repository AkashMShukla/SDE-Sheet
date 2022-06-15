package com.akash.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleusingtwoListOnly {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Final = new ArrayList<>();
        List<Integer> Current = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            Current = new ArrayList<>();
            Current.add(1);
            for(int j = 1;j < i; j++){
                Current.add(Final.get(i-1).get(j - 1) + Final.get(i-1).get(j));
            }
            Current.add(1);
            Final.add(Current);
        }
        return Final;
    }
}
