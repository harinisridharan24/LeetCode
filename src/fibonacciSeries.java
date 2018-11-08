/*
 * Copyright 2018 Harini
 * and open the template in the editor.
 */

package leetcode_questions;

/**
 * @author harini kumar
 */
public class fibonacciSeries {
    public static void main(String[] args) {
        Solution_fibonacciSeries soln = new Solution_fibonacciSeries();
        soln.fibonacci(10);
    }   

}


class Solution_fibonacciSeries {
    public void fibonacci(int n) {
       int number1 = 0;
       int number2 = 1;
       int number3;
       for(int i = 1; i <= n; i++) {
           number3 = number1+ number2;
           System.out.println(number1);
           number1 = number2;
           number2 = number3; 
       }
    }
}