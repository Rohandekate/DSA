package com.leetcode.easy;

public class LeetCode917 {

    public static void main(String[] args) {
    //    String str= reverseOnlyLetters("a-bC-dEf-ghIj");
//        System.out.println(str);
        String   str= reverseOnlyLetters("7_28]");
        System.out.println(str);
  

    }

    public static String reverseOnlyLetters(String s) {

            char[] charArr =s.toCharArray();
            int i=0;
            int j= s.length()-1;


            while(i<=j){

                while(i<j && !Character.isLetter(s.charAt(i))){
                    i++;
                }
                while(j>i && !Character.isLetter(s.charAt(j))){
                    j--;
                }

                char temp= charArr[i];
                charArr[i]=charArr[j];

                charArr[j]= temp;

                i++;
                j--;
            }
            return new String(charArr);

    }


}