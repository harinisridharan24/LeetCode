/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;


/**
 *
 * @author harini kumar
 */
public class Reverse_String {
    public static void main(String[] args){
        Solution soln = new Solution();
        System.out.println(soln.reverseString("hello"));
    }
    
}


class Solution {
    public String reverseString(String s) {
        if(s == "")
        return "There is no string";
        char[] input = s.toCharArray();
        String reverse = "";
        for(int i = input.length-1; i >= 0; i--){
            reverse = reverse + input[i];
        }
        return reverse;
    }
}




//Using StingBuffer function reverse
//------------------------------------------------
//String newString = new StringBuffer(s).reverse().toString();
//        return newString;