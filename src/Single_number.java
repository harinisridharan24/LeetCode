/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;

import java.util.Arrays;

/**
 *
 * @author harini kumar
 */
public class Single_number {
    public static void main(String[] args) {
        Solution_SingleNumber soln = new Solution_SingleNumber();
        int[] result ={4,1,2,1,2};
        System.out.println(soln.singleNumber(result));
        
    }
    
}
class Solution_SingleNumber {
    public int singleNumber(int[] nums) {
        int number = 0;
        for(int i = 0; i < nums.length; i++){
            number ^= nums[i];
        }
        return number;
    }
}
