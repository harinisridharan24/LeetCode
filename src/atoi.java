/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;

import java.util.Stack;

/**
 *
 * @author harini kumar
 */
public class atoi {
    public static void main(String[] args) {
        Solution_StringtoInteger soln = new Solution_StringtoInteger();
        System.out.println(soln.myAtoi(" "));
        
    }
    
}

class Solution_StringtoInteger {
    public int myAtoi(String str) {
        if(str.length() == 0 || str == null)
            return 0;
        int i = 0, sign = 1;
        long number = 0;
        str = str.trim();
        if(str.isEmpty())
            return 0;
        if(str.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if(str.charAt(i) == '+') {
            i++;
        }
        while((i < str.length()-1) && (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
            number = number * 10 + (str.charAt(i) - '0');
            if(sign * number > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign * number < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int) (sign * number);
    }
}