public class LinkedListSort {
	public static void main(String[] args) {
		
	}
}


class ListNodeSort {
     int val;
     ListNodeSort next;
     ListNodeSort(int x) { val = x; }
 }
 
class SolutionSort {
    public ListNodeSort sortList(ListNodeSort head) {
    	if(head == null || head.next == null)
    		return head;
    	//Cut the list into half
    	ListNodeSort previous = null, slow = head, fast = head;
    	while(fast != null || fast.next != null) {
    		previous = slow;
    		slow = slow.next;
    	}
    	previous.next = null;
    	
    	//sort the list
    	ListNodeSort l1 = sortList(head);
    	ListNodeSort l2 = sortList(slow);
    	
    	//merge the list
    	return merge(l1,l2);        
    }
    
    public ListNodeSort merge(ListNodeSort l1, ListNodeSort l2) {
    	ListNodeSort newList = new ListNodeSort(0), current = newList;
    	while(l1 != null || l2 != null) {
    		if(l1.val < l2.val) {
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
    	return newList.next;
    }
}