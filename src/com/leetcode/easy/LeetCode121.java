package com.leetcode.easy;



public class LeetCode121{

    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 1, 6, 8};
        int profit = buyAndSellStocks(arr);
        System.out.println(profit);
    }

    private static int  buyAndSellStocks(int[] prices) {
        int maxProfit=0;
        int min =prices[0];
        //  int [] arr= {7,5,2,1,6,8};

        for(int i =1 ;i< prices.length;i++){

            if(prices[i]<min){
                min=prices[i];
            }
            else{
                maxProfit=Math.max(maxProfit,prices[i]-min);
            }

        }

        return maxProfit;

    }
}
