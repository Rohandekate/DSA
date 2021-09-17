package com.leetcode.easy;

import java.util.Scanner;

public class RangeAddition {
	public static void main(String[] args) {
       
        int[] res = getModifiedArray(5);

        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

	private static int[] getModifiedArray(int length ) {
	
	       
		 int[][] queries = {
				    {1,  3,  2},
				    {2,  4,  3},
				    {0,  2, -2}
				};
		 int [] arr = new int [length];
	       for (int i=0;i<queries.length;i++){
	           int si= queries[i][0];
	           int ei= queries[i][1];
	           int inc= queries[i][2];
	           
	          arr[si]+=inc;
	         if(ei+1<arr.length) {
	        	arr[ei+1]=-inc;
	         }
	          
	       }
	       
	       for(int i=1;i<arr.length;i++) {
	    	   arr[i]=arr[i-1]+arr[i];
	       }
	       return arr;
	}
}
