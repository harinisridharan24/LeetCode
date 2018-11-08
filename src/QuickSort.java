/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode_questions;

import java.util.stream.Collectors;

/**
 *
 * @author harini kumar
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {3,6,1,7,2,8,10,4,9,5};
        quickSort(numbers, 0, numbers.length-1);
        for(int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
    
    static void quickSort(int[] arr, int left, int right) {
        if(left >= right)
            return;
        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }
    
    static int partition(int[] array, int left, int right, int pivot) {
        while(left <= right) {
            while(array[left] < pivot) {
                left++;
            }
            while(array[right] > pivot) {
                right--;
            }
            if(left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return  left;
    }
    static void swap(int[] arr, int left, int right) {
        int temp = 0;
        if(arr[left] > arr[right]) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}
