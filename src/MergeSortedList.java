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

public class MergeSortedList {
    public static void main(String[] args) {
        Solution_SortedList soln = new Solution_SortedList();
        ListNode list = new ListNode(1);
        
    }
}

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { 
          val = x; 
      }
  }

class Solution_SortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode current = new ListNode(0);
        ListNode head = current;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }
            else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null)
            current.next = l1;
        if(l2 != null)
            current.next = l2;
        return head.next;
    }
}
