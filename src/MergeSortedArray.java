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
public class MergeSortedArray {
    public static void main(String[] args) {
        Solution_MergeSortedArray soln = new Solution_MergeSortedArray();
        int[] res1 = {1,2,3,0,0,0};
        int[] res2 = {2,5,6};
        soln.merge(res1, 3, res2, 3);
    }
    
}



class Solution_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        if(nums1 == null || m == 0 || nums2 == null || n == 0)
            System.out.println(0);
        while(i >= 0 && j >= 0){
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
        for(int s = 0; s < nums1.length; s++){
        System.out.println(nums1[s]);  
        }
    }
}