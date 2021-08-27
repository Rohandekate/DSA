package com.leetcode.easy;

public class LeetCode1221 {

    public static void main(String[] args) {
    String s= "RLRRLLRLRL";
        int count=balancedStringSplit(s);

    }
    public  static int balancedStringSplit(String s) {
        int count =0;

        int balanceStrings=0;

        for(int i =0 ;i<s.length(); i++){

            char curr= s.charAt(i);
            if(curr=='L'){
                count++;
            }
            if(curr=='R'){
                count--;
            }
            if(count==0){
                balanceStrings++;
            }
        }
        return balanceStrings;
    }
}
