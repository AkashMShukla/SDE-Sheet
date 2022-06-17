package com.akash.StockBuyAndSell;
// Optimal Solution only uses ArrayList. Code studio solution
import java.util.ArrayList;
import java.util.Arrays;

public class StockBuyAndSell2UsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(7,1,5,3,6,4)); // We have added this as an Input
        System.out.println(FindMaxProfit(arr));
    }
    static int FindMaxProfit(ArrayList<Integer> arr){
        int Max_Profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0;i < arr.size(); i++){
            minPrice = Math.min(minPrice, arr.get(i));  // Calculating min value
            Max_Profit = Math.max(Max_Profit, arr.get(i) - minPrice);
        }
        return Max_Profit;
    }
}
