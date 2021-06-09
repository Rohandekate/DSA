package com.dsa.arrays.Problem1;

/*@Author
 * Rohan Dekate (rohandekate007@gmail.com)
 * 
 * 
 * 
 *  Find 1st occurrence of a value in array if adjacent values differ by 1
 *  
 *  
 *  1. With Brute force
 *  2. Optimize Way
 *  
 *  
 * 
 * */
public class FirstOccurenceofElementProblem1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 2, 1, 7, 4, 5 };
		int[] arr3 = { 1, 2, 3, 2, 1, 3, 4, 5, 6 };

		int repeated = 0;
		try {
			System.out.println("input 1");
			repeated = BruteForce.bruteForceMethodToFindFirstOccurence(arr, 5);
			System.out.println(" Brute Force  element 5 " + "found at " + repeated);

			repeated = OptimizeSolution.find1stOccurrenceOfAValueInArrayIfAdjacentValuesDifferBy1(arr, 5);
			System.out.println(" Optimized element 5 " + "found at " + repeated);
			try {
				System.out.println("input 2");
				repeated = BruteForce.bruteForceMethodToFindFirstOccurence(arr2, 7);

				System.out.println("input arr" + arr + " element 7 " + "found at " + repeated);
			} catch (Exception e) {
				System.out.println("The input is not as expected");
			}
			System.out.println("input 3");
			repeated = BruteForce.bruteForceMethodToFindFirstOccurence(arr3, 2);

			System.out.println("input arr" + arr + " element 2 " + "found at " + repeated);
		} catch (Exception e) {
			System.out.println("The input is not as expected");
		}

	}

}
