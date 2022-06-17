package com.akash.StockBuyAndSell;
// This is Brute Force Approach
public class StockBuyAndSell1 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(FindMaxProfit(arr));
    }
    static int FindMaxProfit(int[] arr){
        int Max_Profit = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                Max_Profit = Math.max(arr[j] - arr[i], Max_Profit); // Comparing previous profit & current profit.
            }
        }
        return Max_Profit;
    }
}
