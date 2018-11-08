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
public class closestValues {
    public static void main(String[] args) {
        Solution_ClosestValues soln = new Solution_ClosestValues();
        int[] result = {2, 5, 6, 7, 8, 8, 9};
        System.out.println(soln.closestValues(result, 4));
        
    }
    
}

class Solution_ClosestValues {
    public int closestValues(int[] nums, int targetValue){
        int smallestNumber = Math.abs(targetValue - nums[0]);
        int index = 0;
        int difference = 0;
        for(int i = 0; i < nums.length; i++){
            difference = Math.abs(targetValue - nums[i]);  
        if(difference < smallestNumber){
            smallestNumber = difference;
            index = i;
        }
      }
        return nums[index];
    }
}
