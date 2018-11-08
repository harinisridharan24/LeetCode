    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;
import java.math.*;

/**
 *
 * @author harini kumar
 */
public class sqrt {
    public static void main(String[] args) {
        Solution_4 soln = new Solution_4();
        int result = soln.mySqrt(16);
        System.out.println("The square root of a number is: " + result);
    }
    
}

class Solution_4{
    public int mySqrt(int x){
        int number = 0;
        double square_root = 0;
        if(x < 0){
            return 0;
        }
        if( x==0 || x == 1){
            return x;
        }
        square_root = Math.pow(x, 0.5);
        number = (int) square_root;
        return number;
    }
}
