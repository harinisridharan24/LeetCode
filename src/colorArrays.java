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
public class colorArrays {
    public static void main(String[] args) {
        int[] result = {2,0,2,1,1,0};
        Solution_sortColorArrays  soln = new Solution_sortColorArrays();
        soln.sortColors(result);
    }
    
}

class Solution_sortColorArrays {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        if(nums.length == 0 || nums == null){
            System.out.println(-1);
        }
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == 0) {
                count0++;
            }
            if(nums[i] == 1) {
                count1++;
            }
            if(nums[i] == 2) {
                count2++;
            }
        }
        for(int j = 0; j < nums.length; j++) {
            if(j < count0) {
                nums[j] = 0;
            }
            else if(j < count0 + count1){
                nums[j] = 1;
            }
            else {
                nums[j] = 2;
            }
        }
    }
}