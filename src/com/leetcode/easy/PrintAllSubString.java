package com.leetcode.easy;

public class PrintAllSubString {

	public static void main(String[] args) {
		printAllPalindromicSubString("google");

	}

	private static void printAllPalindromicSubString(String str) {
		int count = 0;
		int maxLen = 0;
		String maxLenStr = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String subString = str.substring(i, j);
				if (isPalindrome(subString)) {
					int currLen = subString.length();
					if (currLen > maxLen) {
						maxLen = currLen;
						maxLenStr = subString;
					}
					System.out.println("" + subString);
					count++;

				}
			}
		}
		System.out.println("count=" + count);
		System.out.println("maxLen=" + maxLen);
		System.out.println("maxLenStr=" + maxLenStr);

	}

	private static boolean isPalindrome(String str) {
		// NITIN
		int start = 0;
		int end = str.length() - 1;
		while (start <= end) {
			char i = str.charAt(start);
			char j = str.charAt(end);
			if (i != j) {
				return false;
			} else {
				start++;
				end--;
			}

		}

		return true;
	}

}
