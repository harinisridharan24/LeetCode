/*
 * Copyright 2018 Harini
 * and open the template in the editor.
 */

package leetcode_questions;

/**
 * @author harini kumar
 */
public class ReverseInteger {
    public static void main(String[] args) {
        Solution_NumberReverse num = new Solution_NumberReverse();
        System.out.println(num.reverseNumber(234));
    }  
}

class Solution_NumberReverse {
    public int reverseNumber(int number) {
        int reverseNumber = 0;
        if(number ==0)
            return 0;
        while(number != 0) {
            int remainder = number %  10;
            reverseNumber = reverseNumber * 10 + remainder;
            number = number / 10;
        }
        return reverseNumber;
    }
}
