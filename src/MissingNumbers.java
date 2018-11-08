/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author harini kumar
 */
public class MissingNumbers {
    public static void main(String[] args) {
        Solution_MissingNumbers soln = new Solution_MissingNumbers();
        int[] result = {9,4,6,7};
        System.out.println(soln.missingNumber(result));
        
    }
    
}

class Solution_MissingNumbers {
    public int missingNumber(int[] nums) {
           Set<Integer> number_set = new HashSet<Integer>();
           for (int num : nums) 
               number_set.add(num);
           for (int number = 0; number < nums.length; number++) {
               if (!number_set.contains(number)) {
                   return number;
            }
        }
        return -1;
    }
}
