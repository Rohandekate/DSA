package com.leetcode.hard;

public class TappingRainingWater {

	 public static void main(String[] args)
	    {
	        int[] heights = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };
	 
	        System.out.print("The maximum amount of water that can be trapped is " +
	                                trap(heights));
	    }

	private static int trap(int[] heights) {
		 int max=0;
		
		 int i=0;int j=heights.length-1;
		 
		 while(i<j) {
			 
			 int len=j-i;
			 int min= Math.min(heights[j], heights[i]);
			 int currArea=min*len;
			 max=Math.max(max, currArea);
			 if(i<j) i++;
			 else j--;
		 }
		 
		 
		return max;
	}
}
