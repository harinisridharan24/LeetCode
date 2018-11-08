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
public class jumpGame {
    public static void main(String[] args) {
        int[] result = {0};
        Solution_JumpGame soln = new Solution_JumpGame();
        System.out.println(soln.canJump(result));
    }
}

class Solution_JumpGame {
    public boolean canJump(int[] nums) {
        int maximum = 0;
        if(nums.length == 0)
            return false;
        for(int i = 0; i < nums.length; i++) {
            if(i > maximum) 
                return false;
            maximum = Math.max(nums[i] + i, maximum);
        }
        return true;
    }
}