package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
	public static void main(String[] args) {
		int A[] ={1,1,1};

		System.out.println(maxLen(A,2));
	}

private static int maxLen(int[] a, int k) {

	int i=0;int j=0;
	int maxSum=0;
	int result = 0;
	Map<Integer,Integer> map= new HashMap<>();
	map.put(0, 1);
	 for (  i= 0; i < a.length; i++) {
		 maxSum+=a[i];
		 if(map.containsKey(maxSum-k)) {
		//	 result+=map.get(maxSum-k);
			 result++;
		 }
		map.put(maxSum,1);
	}
	return result;
	
	
}
}