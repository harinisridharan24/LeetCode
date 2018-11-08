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
public class findPeakElement {
    public static void main(String[] args) {
        Solution_PeakElement soln = new Solution_PeakElement();
        int[] result = {1,2,3,1};
        System.out.println(soln.findPeakElement(result));
    }
    
}

class Solution_PeakElement {
    public int findPeakElement(int[] nums) {
        int maxLength = nums.length;
        int low = 0;
        int mid = 0;
        int high = maxLength-1;
        while(low < high) {
            mid = low + (high - low)/2;
            if(nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
}