package com.akash.StockBuyAndSell;
// We are using only single loop
// O(n) Complexity
public class StockBuyAndSell2 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(FindMaxProfit(arr));
    }
    static int FindMaxProfit(int[] arr){
        int Max_Profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length; i++){
            minPrice = Math.min(minPrice, arr[i]);  // Calculating min value
            Max_Profit = Math.max(Max_Profit, arr[i] - minPrice);
        }
        return Max_Profit;
    }

}
