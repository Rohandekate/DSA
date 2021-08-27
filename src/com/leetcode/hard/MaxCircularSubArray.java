package com.leetcode.hard;

public class MaxCircularSubArray {

 
		public static void main(String[] args)
	    {
	       int[] A = { 2, 1, -5, 4, -3, 1, -3, 4, -1 };
	    	//int[] A = { -11, 2, 3, -2, 5 };
	 
	        System.out.println("The sum of the subarray with the largest sum is " +
	                runCircularKadane(A));
	        
	        int[] A2 =    {-3, 1, -3, 4, -1, 2, 1, -5, 4};
	     System.out.println("The sum of the subarray with the largest sum is " +
	                runCircularKadane(A2));
	    }

		private static int runCircularKadane(int[] a) {
			int max=0;
			int initialPositive=0;
			int totalSum=0;
			initialPositive=	kadaneAlgo(a);
			System.out.println(initialPositive);
			for (int i = 0; i < a.length; i++) {
				totalSum += a[i];
				a[i] = a[i] * -1;

			}
		int finalPositive=	kadaneAlgo(a);
		totalSum=totalSum+finalPositive;
		max=	Math.max(totalSum, initialPositive);
			return max;
			
			
		 
		}

		private static int kadaneAlgo(int[] a) {
			int n = a.length;
			int currSum = 0, max =0;
			for (int i = 0; i < a.length; i++) {
				currSum += a[i];
				if (currSum < 0) {
					currSum = 0;
				} else {
					if (currSum > max) {
						max = currSum;
					}
				}
			}
			return max;
		}
		
 

}
