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
public class rotateArrays {
    public static void main(String[] args) {
        Solution_rotateArrays soln = new Solution_rotateArrays();
        int[] result = {-1,-100,3,99};
        soln.rotate(result, 3);
    }
    
}
class Solution_rotateArrays {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);

    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
