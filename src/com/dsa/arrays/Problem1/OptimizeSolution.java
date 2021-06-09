package com.dsa.arrays.Problem1;

public class OptimizeSolution {

	public static int find1stOccurrenceOfAValueInArrayIfAdjacentValuesDifferBy1(int[] arr, int element) {
		if(checkAllArrElementDifferBy1(arr)) {
		
		int startPos = 0;
		while (startPos < arr.length) {
			if (arr[startPos] == element) {
				return startPos;
			}
			int diff = Math.abs(arr[startPos] - element);
			startPos = startPos + diff;
		}

		
		}
		return -1;
	}

	private static boolean checkAllArrElementDifferBy1(int[] arr) {
		int i=1;
		 while( i<=arr.length-1) {
		return	 !BruteForce.diffbetwn2Occur(arr, i);
		 }
		return false;
	}
}
