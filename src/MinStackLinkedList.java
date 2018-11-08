/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class MinStackLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MinStackLL obj = new MinStackLL();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		int param_1 = obj.getMin();
		System.out.println("Before pop minimum value:" +param_1);
		int param_3 = obj.top();
		int param_4 = obj.getMin();
		System.out.println("Top: " +param_3);
		System.out.println("Minimum value: " +param_4);
	}
}

class MinStackLL {

    class Node {
        int value;
        int min;
        Node next;

        Node(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    private Node top;
    /** initialize your data structure here. */
    public MinStackLL() {

    }

    public void push(int x) {
        if (top == null) {
            top = new Node(x, x);
        } else {
            Node n = new Node(x, Math.min(top.min, x));
            n.next = top;
            top = n;
        }
    }

    public void pop() {
        if (top == null) {
            return;
        } else {
            Node temp = top.next;
            top.next = null;
            top = temp;
        }
    }

    public int top() {
        if (top == null) {
            return -1;
        }
        return top.value;
    }

    public int getMin() {
        if (top == null) {
            return -1;
        }
        return top.min;
    }
}
