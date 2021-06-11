package com.dsa.arrays.Problem3;
/*
 * @Author Rohandekate007@gmail.com
 * 
 * Leet Code https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * */
public class LeetCodeBuyAndSellStocks {

	public static void main(String[] args) {
		int [] prices = {7,1,5,3,6,4};
		
		int max_profit = MaxProfit.maxProfit(prices);
		System.out.println("max_profit=="+max_profit);
		

	}

}
