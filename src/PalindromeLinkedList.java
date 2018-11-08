
public class PalindromeLinkedList {

	public static void main(String[] args) {
		
	}

}



class ListNodeLP {
    int val;
    ListNodeLP next;
    ListNodeLP(int x) { 
    	val = x; 
    	}
}
class SolutionLP {
    public boolean isPalindrome(ListNodeLP head) {
    	ListNodeLP slow = head, fast = head;
    	while(fast != null && fast.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	if(fast !=  null)
    		slow = slow.next;
    	slow = reverseList(slow);
    	fast = head;
    	while(slow != null) {
    		if(fast.val != slow.val) {
    			return false;
    		}
    		fast = fast.next;
    		slow = slow.next;
    	}
		return true;
        
    }
    
    public ListNodeLP reverseList(ListNodeLP head) {
        if(head == null || head.next == null)
            return head;
        ListNodeLP previous = null;
        ListNodeLP temp_node = head.next;
        while(head != null){
            head.next = previous;
            previous = head;
            head = temp_node;
        }
        return previous;
    }
}  