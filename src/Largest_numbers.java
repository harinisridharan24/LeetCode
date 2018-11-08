/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcode_questions;
import java.util.*;

/**
 *
 * @author harini kumar
 */
public class Largest_numbers {
    public static void main(String[] args) {
        Solution_largest soln = new Solution_largest();
        int[] result = {3,30,34,5,9};
        System.out.println(soln.largestNumber(result));
        
    }
    
}

class Solution_largest {
    public String largestNumber(int[] nums) {
        if(nums.length == 0 || nums == null)
            return "";
        String[] string_numbers = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            string_numbers[i] = nums[i] + "";
        }
        Comparator<String> compare = new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                String str1 = string1 + string2;
                String str2 = string2 + string1;
                return str1.compareTo(str2);
            }
        };
        Arrays.sort(string_numbers, compare);
        if(string_numbers[string_numbers.length-1].charAt(0) == '0')
            return "0";
        String s = new String();
        for(int i = 0; i < string_numbers.length; i++){
            s = string_numbers[i]+s;
        }
        return s;
    }
}