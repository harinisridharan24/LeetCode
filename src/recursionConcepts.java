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
public class recursionConcepts {
    //1st : Summation
    
    public static int Summation(int n) {
        //Base Case:
        if(n <= 0) {
            return 0;
        }
        //Recursive Case:
        else {
            return n + Summation(n-1);
        }
    }
    
    //2nd: Factorial
    
    public static int Factorial(int n) {
        //Base Case:
        if(n <= 1) {
            return 1;
        }
        //recursive Case:
        else {
            return n * Factorial(n-1);
        }
    }
    
    //3rd: Exponentiation
    //p is the exponent
    //5^3
    public static int Exponentiation(int n, int p) {
        //Base Case:
        if(p <= 0) {
            return 1;
        }
        //Recursive Case:
        
        else {
            return n * Exponentiation(n, p-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(3));
        System.out.println(Exponentiation(5, 3));
    }
    
}
