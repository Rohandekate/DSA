package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4 };
		System.out.println(twoSum(arr, 6));

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] targetArr = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;

		 //324

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				targetArr[0] = map.get(nums[i]);
				targetArr[1]=i;
			} else {
				map.put(target - nums[i], i);

			}
		}

		return targetArr;
	}
}
