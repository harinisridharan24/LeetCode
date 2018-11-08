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
public class fibonacci {
    public static void main(String[] args) {
        Solution_fibonacci soln = new Solution_fibonacci();
        System.out.println(soln.fibo(10));
        
    }
    
}


class Solution_fibonacci {
    public int fibo(int n){
        if(n <= 1)
            return n;
//        int first = 0;
//        int second = 1;
//        int third = 0;
//        for(int i = 0; i < n; i++) {
//            third = first + second;
//            first = second;
//            second =third;
//        }
//        return first;
     return fibo(n-1) + fibo(n-2);
    }
}


