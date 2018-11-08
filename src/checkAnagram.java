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
public class checkAnagram {
    public static void main(String[] args) {
        Solution_Array sol = new Solution_Array();
        System.out.println(sol.isAnagram("rat", "car"));
    }
    
}









class Solution_Array {
    public boolean isAnagram(String s, String t) {
        boolean result = false;
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        result = Arrays.equals(s_array, t_array);
        if(result)
            return true;
        else
            return false;
    }
}