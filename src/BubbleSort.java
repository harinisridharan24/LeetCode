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
public class BubbleSort {
    public static void main(String[] args) {
        int[] result = {33,47,1,3,5};
        int temp = 0;
        for(int i = 0; i < result.length; i++) {
            for(int j = i + 1; j < result.length; j++) {
                if(result[i] > result[j]) {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}


//public class BubbleSort {
//    public static void main(String[] args) {
//        int[] result = {33,47,1,3,5};
//        int temp = 0;
//        for(int i = 0; i < result.length; i++) {
//            for(int j = 1; j < result.length -i; j++) {
//                if(result[j-1] > result[j]) {
//                    temp = result[j-1];
//                    result[j-1] = result[j];
//                    result[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(result));
//    }
//}
