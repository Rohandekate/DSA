package com.dsa.arrays.Problem3;

public class MaxProfit {

	public static int maxProfit(int[] prices) {
		int i = 0;

		int pos = 0;
		int max = 0;
		while (i < prices.length) {

			int j = 1;
			while (j < prices.length - i) {

				if (prices[j] - prices[i] > 0) {

					int currMAx = prices[j] - prices[i];
					if (currMAx > max) {
						max = currMAx;
					}

				}
				j++;
			}

			i++;

		}
		return max;
	}

}
