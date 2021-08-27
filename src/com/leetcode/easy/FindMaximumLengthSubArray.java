package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMaximumLengthSubArray {

	 public static void main (String[] args)
	    {
		  int[] A = { 2, 1, -5, 4, -3, 1, -3, 4, -1 };

	        int sum = 8;
	 
	       System.out.println( findMaxLenSubarray(A, 0));
	    }

	private static int findMaxLenSubarray(int[] a, int sum) {
		int currSum=0;
		int maxLen=0;
	    int totalMax=0;
		int currLen=0;
		Map<Integer,Integer> map= new HashMap<>();
		Map<Integer,Integer> indexMap= new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			
			currSum+=a[i];
			if(map.containsKey(currSum-sum) ){
				currLen=i-	map.get(currSum-sum);
				indexMap.put(map.get(currSum-sum)+1 , i);
				if (currLen > maxLen) {
					maxLen = currLen;
				}
				
				
			}
			map.putIfAbsent(currSum, 1);
		}
		
		for (Entry<Integer, Integer> entry : indexMap.entrySet()) {
			System.out.println(entry.getValue()+"--"+entry.getKey());
			int currMax=entry.getValue()-entry.getKey();
		 
			totalMax=	Math.max(currMax, totalMax);
		}
		System.out.println("maxLen="+maxLen);
		return totalMax;
	}
 
}
