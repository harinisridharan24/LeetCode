/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class LinkedListCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}


  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }
 

class SolutionLLC {
	public boolean hasCycle(ListNode head) {
		while(head != null) {
			if(head.next == head)
				return true;
			ListNode current = head.next;
			head.next = head;
			head = current;
		}
		return false;
		
	}
}

//public boolean hasCycle(ListNode head) {
//	if(head == null)
//		return false;
//	ListNode slow = head;
//	ListNode fast = head;
//	while(fast != null && fast.next != null) {
//		slow = slow.next;
//		fast = fast.next.next;
//	}
//	if(slow == fast)
//		return true;
//	return false;
//}

