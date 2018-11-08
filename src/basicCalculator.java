/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;

import static java.lang.System.in;
import java.util.Stack;

/**
 *
 * @author harini kumar
 */
public class basicCalculator {
    public static void main(String[] args) {
        Solution_basicCalculator soln = new Solution_basicCalculator();
        System.out.println(soln.calculate("3+2*2"));
    }
}

class Solution_basicCalculator {
    public int calculate(String s) {
    if(s == null || (s.length() == 0))
            return 0;
    Stack<Integer> stack = new Stack<Integer>();
    int num = 0;
    char sign = '+';
    for(int i = 0; i < s.length(); i++) {
        if(Character.isDigit(s.charAt(i))) {
            num = num*10+s.charAt(i)-'0';
        }
        if((!Character.isDigit(s.charAt(i)) && ' '!=s.charAt(i)) || i == s.length()-1) {
            if(sign=='-'){
                stack.push(-num);
            }
            if(sign=='+'){
                stack.push(num);
            }
            if(sign=='*'){
                stack.push(stack.pop()*num);
            }
            if(sign=='/'){
                stack.push(stack.pop()/num);
            }
            sign = s.charAt(i);
            num = 0;
        }
    }

    int answer = 0;
    for(int i:stack){
        answer += i;
    }
    return answer;
}
}