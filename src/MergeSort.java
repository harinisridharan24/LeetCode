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
public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {3,6,1,7,2,8,10,4,9,5};
        sort(numbers, 0, numbers.length-1);
        for(int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
        
    }
    static void sort(int[] arr, int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    
    static void merge(int[] ar, int low, int mid, int high) {
        int n = high - low + 1;
        int[] temp = new int[n];
        int i = low, j = mid +1;
        int k = 0;
        while(i <= mid || j <= high) {
            if(i > mid)
                temp[k++] = ar[j++];
            else if(j > high)
                temp[k++] = ar[i++];
            else if(ar[i] < ar[j])
                temp[k++] = ar[i++];
            else
                temp[k++] = ar[j++];
        }
        for(j = 0; j < n; j++)
            ar[low + j] = temp[j];
        
    }
    
}


