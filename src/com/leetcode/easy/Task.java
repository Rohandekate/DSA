package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Task {
	public static void main(String[] args) {
		int A[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

		System.out.println(maxLen(A, A.length));
	}

	private static int maxLen(int[] a, int length) {
		//map={0=-1, 48=7, 7=3, 8=4, 25=6, 13=1, 15=0}
		int maxLen=0;
		int maxSum=0;
		int i =-1;
		int count=0;
 Map<Integer,Integer> map= new HashMap<>();
 map.put(maxSum, i);
 while(i<length-1) {
	 i++;
	 maxSum+=a[i];
	 if(map.containsKey(maxSum-0)) {
		 maxLen+= map.get(maxSum);
		 count++;
		 System.out.println();
		 
	 }
	 else {
		 map.put(maxSum,i);
	 }
	 
 }
 
 System.out.println("count="+count);
 
 return maxLen;
 
 
 
		
		
		
	}
}
