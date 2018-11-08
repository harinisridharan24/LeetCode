/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author harini kumar
 */
public class validParenthesis {
    public static void main(String[] args) {
        Solution_Parentheses soln = new Solution_Parentheses();
        System.out.println(soln.isValid("(]"));
    }
    
}

class Solution_Parentheses {
    public boolean isValid(String s) {
        char[] character = s.toCharArray();
        Map<Character,Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<Character>();
        if(s == ""){
            return true;
        }
        for(char brackets : character){
            if(map.containsKey(brackets)){
                stack.push(map.get(brackets));
            }
            else {
                if(stack.isEmpty() || brackets != stack.pop()){
                return false;
                }
            }
        }
        return stack.isEmpty();    
    }
}
