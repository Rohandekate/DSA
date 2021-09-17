package com.dsa.arrays.Problem1;

import java.util.HashSet;
import java.util.Set;

public class BruteForce {

	public static Integer bruteForceMethodToFindFirstOccurence(int[] arr, int element) throws Exception {
		if(arr.length==0) {   
			return -1;
		}
		
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for (int i = 1; i <= arr.length - 1; i++) {

			if (diffbetwn2Occur(arr, i)) {
				System.out.println(i);
				throw new Exception("input is not as expected for arr" + arr);
			}

			if (set.contains(element) && arr[i] == element) {
				set.clear();
				return i;
			}
		}

		return null;

	}

	public static boolean diffbetwn2Occur(int[] arr, int i) {
		 
	
		if (Math.abs(arr[i - 1] - arr[i])== 1) {

			return false;
		}
		System.out.println("arr i-->  " + arr[i - 1] + "  " + arr[i]);
		return true;
	}
}
