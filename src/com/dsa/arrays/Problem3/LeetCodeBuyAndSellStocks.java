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
		
		int max_profit_brute_force = MaxProfitViaBruteForce.maxProfit(prices);
		int max_profit_Optimized = OptimizedSolution.maxProfit(prices);
		
		System.out.println("max_profit via brute_force=="+max_profit_brute_force);
		System.out.println("max_profit via Optimized=="+max_profit_Optimized);

	}

}
