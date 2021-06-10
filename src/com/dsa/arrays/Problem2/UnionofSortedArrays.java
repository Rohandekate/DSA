package com.dsa.arrays.Problem2;

import java.util.List;

public class UnionofSortedArrays {

	public static List<Integer> union(int[] arr1, int[] arr2, List<Integer> list) {
		int i = 0;
		int j = 0;
//		int [] arr1= {1,2,2,2,2,2,3,4,5,6,7};
//		int [] arr2= {3,3,3,3,4,4,5};

		while (i < arr1.length && j < arr2.length) {
			while (i < arr1.length - 1 && arr1[i] == arr1[i + 1]) {
				i++;

			}

			while (j < arr2.length - 1 && arr2[j] == arr2[j + 1]) {
				j++;

			}
			if (arr1[i] < arr2[j]) {
				list.add(arr1[i++]);

				// i++;
			} else if (arr1[i] > arr2[j]) {
				list.add(arr2[j++]);

				// sj++;
			} else {
				list.add(arr2[j]);

				i++;
				j++;
			}

		}

		while (i < arr1.length) {
			if (i < arr1.length - 1 && arr1[i] == arr1[i + 1]) {
				i++;

			} else {
				list.add(arr1[i++]);

			}

		}

		while (j < arr2.length) {
			if (j < arr2.length - 1 && arr2[j] == arr2[j + 1]) {
				j++;

			} else {
				list.add(arr1[j++]);

			}
		}
		return list;
	}
}
