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
public class Palindrome {
    public static void main(String[] args){
        Solutions_3 soln = new Solutions_3();
        boolean result = soln.isPalindrome(121);
        boolean result1 = soln.isPalindrome(-121);
        System.out.println("The result is:" + result);
        System.out.println("The result1 is:" + result1);
        
    }
    
}

class Solutions_3{
    public boolean isPalindrome(int x){
        int reversed_number = 0;
        if(x < 0){
            return false;
        }
        int number = x;
        while(number != 0){
            int remainder = number % 10;
            reversed_number = (reversed_number * 10) + remainder;
            number = number / 10;
        }
        if(x != reversed_number){
            return false;
        }
        return true;
    }
}
