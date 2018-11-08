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
public class MissingPositive {
    public static void main(String[] args) {
        Solution_MissingPositive soln = new Solution_MissingPositive();
        int[] result = {-1,-3};
        System.out.println(soln.firstMissingPositive(result));
    }
    
}

class Solution_MissingPositive {
    public int firstMissingPositive(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int index = nums[start] - 1;
            if (index == start)
                start++;
            else if (index < 0 || index > end || nums[start] == nums[index])
                nums[start] = nums[end--];
            else {
                nums[start] = nums[index];
                nums[index] = index + 1;
            }
        }
        return start + 1;
    }
}
