package com.leetcode.easy;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		int[] arr = { -11, 2, 3, -2, 5 };
	System.out.println(kandaneForMaxSubArray(arr));

	}

	public static int kandaneForMaxSubArray(int[] arr) {
		int currSum = 0;
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			if (currSum < 0) {
				currSum = 0;
			}
			if (currSum > maxSum) {
				maxSum = currSum;
			}
			
			 
		}
		return maxSum;
	}
}
