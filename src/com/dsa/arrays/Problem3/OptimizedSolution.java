package com.dsa.arrays.Problem3;

public class OptimizedSolution {
	public static int maxProfit(int[] prices) {
		 int minprice = Integer.MAX_VALUE ;
	        int maxprofit = 0;
	        // {7,1,5,3,6,4};
	        for(int i = 0; i<prices.length ; i++)
	        {
	            if(prices[i]<minprice)
	                minprice = prices[i];
	            
	            else if(prices[i] - minprice >maxprofit)
	                maxprofit = prices[i]-minprice;
	        }
	        return maxprofit;
	    }
	 
}
