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
public class Two_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Solutions soln = new Solutions();
        int[] array = {2,4,5,6};
        int [] result = new int[5];
        result = soln.twoSum(array, 10);
        System.out.println(Arrays.toString(result));
        
        
    }
    
}

class Solutions {
    
    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = 1 ; j < nums.length; j++){
                if((i != j) && (nums[i] + nums[j] == target)){
                   return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No such solution");
    }
    
}