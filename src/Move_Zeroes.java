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
public class Move_Zeroes {
    public static void main(String[] args) {
        Solution_MoveZeroes soln = new Solution_MoveZeroes();
        int[] result ={0,1,0,3,12};
        soln.moveZeroes(result);
    }
    
}


class Solution_MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0)
            System.out.println(0);
        int position = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
                nums[position++] = nums[i];
        }
        while(position < nums.length){
            nums[position++] = 0;
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}