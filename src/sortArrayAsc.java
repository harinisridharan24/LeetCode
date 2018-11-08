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
public class sortArrayAsc {
    public static void main(String[] args) {
       Solution_ArraySortAsc soln = new Solution_ArraySortAsc();
        int[] res = {10,6,4,9,0};
        System.out.println(Arrays.toString(soln.sort(res)));
    }
    
}

class Solution_ArraySortAsc {
    public int[] sort(int[] nums) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp; 
                }
            }
        }
        return nums;
    } 
}
