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
public class searchRange {
    public static void main(String[] args) {
        Solution_searchRange soln = new Solution_searchRange();
        int[] res = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(soln.searchRange(res, 6)));
        
    }  
}
class Solution_searchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2]; 
        result[0] = findFirstRange(nums, target);
        result[1] = findLastRange(nums, target);
        return result;
    }
    
    private int findFirstRange(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(nums[mid] >= target) {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
            if(nums[mid] == target) 
                index = mid;
        }
        return index;
    }
    private int findLastRange(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] <= target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            if(nums[mid] == target) 
                index = mid;
        }
        return index; 
    }
}