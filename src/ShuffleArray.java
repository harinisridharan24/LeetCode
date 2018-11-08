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
public class ShuffleArray {
    public static void main(String[] args) {
        int[] result = {1,2,3};
        Solution_shuffle soln = new Solution_shuffle(result);
        int[] param_1 = soln.reset();
        int[] param_2 = soln.shuffle();
        System.out.println(param_1);
        System.out.println(param_2);
    }
    
}


class Solution_shuffle {
    private int[] nums;
    
    Solution_shuffle(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] rand = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int r = (int) (Math.random() * (i+1));
            rand[i] = rand[r];
            rand[r] = nums[i];
        }
        return rand;
    }
}