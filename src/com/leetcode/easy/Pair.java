package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Pair {
public static void main(String[] args) {
	 int[] A = { 8, 7, 2, 5, 3, 1 };
     int sum = 10;
 
     findPair(A, sum);
}

private static void findPair(int[] a, int sum) {
	 
	Map<Integer,Integer> map= new HashMap<>();
	for (int i = 0; i < a.length; i++) {
		 
		 if(map.containsKey(sum-a[i])) {
			 System.out.println("Pair is ="+map.get(sum-a[i])+","+""+i);
			 
			 
		 }
			map.put(a[i], i);	 
		
		
	}
	
}
}
