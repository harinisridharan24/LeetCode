import java.util.LinkedList;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class AddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}

class ListNodes {
     int val;
     ListNodes next;
     ListNodes(int x) { val = x; }
 }
 
class Solution {
    @SuppressWarnings("null")
	public ListNodes addTwoNumbers(ListNodes l1, ListNodes l2) {
    	ListNodes head = new ListNodes(0);
    	ListNodes current = head;
    	int carry = 0;
    	while(l1 != null || l2 != null || carry != 0) {
    		int sum = 0;
    		if(l1 != null) {
    			sum += l1.val;
    			l1 = l1.next;
    		}
    		if(l2 != null) {
    			sum += l2.val;
    			l2 = l2.next;
    		}
    		sum += carry;
    		current.next = new ListNodes(sum %10);
    		current = current.next;
    		carry = sum / 10;
    	}
		return current.next;
        
    }
}