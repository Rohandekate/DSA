package com.dsa.arrays.Problem2;

import java.util.ArrayList;
import java.util.List;

/*@Author
 * Rohan Dekate (rohandekate007@gmail.com)
 * 
 * 
 * 
 *   Union of Two Sorted Arrays
 *  
 *  
 * 
 *  
 *  
 * 
 * */
public class UnionOfTwoSortedArrays {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = { 3, 3, 3, 3, 4, 4, 5 };

		List<Integer> list = new ArrayList<>();
		List<Integer> unionList = UnionofSortedArrays.union(arr1, arr2, list);
		System.out.println("final :- "+unionList);

	}
}
