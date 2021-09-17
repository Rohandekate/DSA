package com.leetcode.easy;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int [] water= {1,24,5,7,12,54,56,76,8,99,8};
		mostWater(water);

	}
	 public static int mostWater(int[] heights) {
	       int i=0; 
	       int j=heights.length-1;
	       System.out.println(j);
	       int maxArea=0;
	       while(i<j){
	           
	           if(heights[i]<heights[j]){
	               int height=heights[j];
	               int breadth= j-i;
	               maxArea=Math.max(maxArea,height*breadth);
	               i++;
	           }else{
	                 int height=heights[i];
	               int breadth= j-i;
	               maxArea=Math.max(maxArea,height*breadth);
	               j++;
	           }
	           
	       }
	       return maxArea;
	       
	    }
}
