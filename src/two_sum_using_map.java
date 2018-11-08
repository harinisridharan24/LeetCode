/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author harini kumar
 */
public class two_sum_using_map {
    public static void main(String[] args){
        Solution_2 solution = new Solution_2();
        int[] array = {2,4,5,6};
        int[] result = new int[5];
        result = solution.two_sum_map(array, 6);
        System.out.println(Arrays.toString(result));
        
    }
    
}

class Solution_2{
    public int[] two_sum_map(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int number = target - nums[i];
            if(map.containsKey(number)){
                return new int[] {map.get(number),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No such solutions found");
    }
}
