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
public class PowerN {
    public static void main(String[] args) {
        Solution_Power soln = new Solution_Power();
        System.out.println(soln.myPow(2.0000, 10));
    }
}

class Solution_Power {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }
}


//    public double myPow(double x, int n) {
//        if (n == 0) return 1.0;
//        if (n == 1) return x;
//        if (n == -1) return 1 / x;
//        double sqrt = myPow(x, n / 2);
//        return sqrt * sqrt * myPow(x, n % 2);
//    }