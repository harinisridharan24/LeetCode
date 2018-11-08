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
public class String_palindrome {
    public static void main(String[] args) {
        Solution_Palindrome soln = new Solution_Palindrome();
        String res_string = soln.longestPalindrome("hello");
        System.out.println(res_string);
            
        }
    }
    


class Solution_Palindrome {
    public String longestPalindrome(String s) {
        if(s == "" || s.length() == 0)
            return "0";
        StringBuilder strings = new StringBuilder(s);
        String newString = strings.reverse().toString();
        return newString;
    }
}
