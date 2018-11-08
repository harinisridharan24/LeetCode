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
public class Reverse_Linkedlist {
    public static void main(String[] args) {
        Solution_ReverseLinkedlist soln = new Solution_ReverseLinkedlist();
        
    }
    
}




class ListNode_reverse {
     int val;
     ListNode_reverse next;
     ListNode_reverse(int x) { 
         val = x; 
     }
 }

class Solution_ReverseLinkedlist {
    public ListNode_reverse reverseList(ListNode_reverse head) {
        if(head == null || head.next == null)
            return head;
        ListNode_reverse previous = null;
        ListNode_reverse current = head;
        ListNode_reverse temp_node = current.next;
        while(current != null){
            current.next = previous;
            previous = current;
            current = temp_node;
        }
        return previous;
    }
}

//Recursive method
//-------------------
//public ListNode_reverse reverseList(ListNode_reverse head) {
//    if(head == null || head.next == null)
//        return head;
//    ListNode_reverse second = head.next;
//    head.next = null;
//    ListNode_reverse rest = reverseList(second);
//    second.next = head;
//    return rest;
//}