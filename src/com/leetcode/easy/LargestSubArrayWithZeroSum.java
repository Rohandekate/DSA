package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
 
//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

//Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.
//Input:
//N = 8
//A[] = {15,-2,2,-8,1,7,10,23}
//Output: 5
//Explanation: The largest subarray with
//sum 0 will be -2 2 -8 1 7.

public class LargestSubArrayWithZeroSum {

	public static void main(String[] args) {
		int A[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

		System.out.println(maxLen(A, A.length));
	}

	public static int maxLen(int arr[], int n) {

		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int i = -1; 

		int maxlen = 0;
		map.put(sum, i);    

		while (i < arr.length - 1) {
			
			i++;
			sum += arr[i];  
			System.out.println("maxSum="+sum);
		
			
			if (!map.containsKey(sum)) {
				map.put(sum, i);
				System.out.println("map="+map);

			} else {
				System.out.println(i);
				int len= i - map.get(sum);
				maxlen = Math.max(maxlen, len);

			}

		}

		return maxlen;
	}
}