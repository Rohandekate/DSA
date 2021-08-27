package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		longestPalindrome("aaaabbbbbcccccdddd");
		
	}

	public static int longestPalindrome(String s) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}

		int length = 0;
		boolean firstOdd = false;
		for (Character ch : map.keySet()) {

			if (map.get(ch) % 2 == 0) {
				length += map.get(ch);
			} else if (firstOdd == false) {
				length += map.get(ch);
				firstOdd = true;
			} else {
				length += map.get(ch) - 1;
			}
		}

		return length;

	}

}
