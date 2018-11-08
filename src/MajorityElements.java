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
public class MajorityElements {
    public static void main(String[] args) {
        Solution_MajorityElements soln = new Solution_MajorityElements();
        int[] result = {6,6,6,7,7};
        System.out.println(soln.majorityElement(result));
    }
    
}

class Solution_MajorityElements {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int count = 0;
        int majority_element = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                majority_element = nums[i];
                count++;
            }
            else if(nums[i] == majority_element) {
                    count++;
                if(count > nums.length/2)
                    return majority_element;
            }
            else count--;
        }  
        return majority_element; 
    }
}


/*Another Approach
--------------------
Arrays.sort(nums);
return nums[nums.length/2];
*/


