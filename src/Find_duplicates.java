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
public class Find_duplicates {
    public static void main(String[] args) {
        Solution_findDuplicates soln = new Solution_findDuplicates();
        int ans[] = {3,1,3,4,2};
        System.out.println(soln.findDuplicate(ans));
    }
    
}

class Solution_findDuplicates {
    public int findDuplicate(int[] nums) {
        if(nums.length == 0 || nums == null)
            return 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1])
                return nums[i];
        }
        return -1;
    }
}