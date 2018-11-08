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
public class Remove_duplicate_numbers {
    public static void main(String[] args) {
        Solution_duplicate soln = new Solution_duplicate();
        int[] result = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(soln.removeDuplicates(result));  
    }
}


class Solution_duplicate {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int j = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j;
    }
}       