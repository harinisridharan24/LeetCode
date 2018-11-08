/**
 * 
 */

/**
 * @author harini kumar
 *
 */
class Node {
	int value;
	Node next;
	
	
	public Node() {
		value = 0;
		next = null;
	}
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
  
class LinkedStack {
	Node top;
	int size;
	
	public LinkedStack() {
		top = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void push(int data) {
		Node newNode = new Node(data, null);
		if(top == null) 
			top = newNode;
		else {
			newNode.setNext(top);
			top = newNode;
		}
		size++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("The stack is Empty");
		}
		Node pointer = top;
		top = pointer.getNext();
		size--;
		return pointer.getValue();
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("The stack is Empty");
		}
		return top.getValue();
	}
	
	public void display() {
		System.out.println("Stack = ");
		if(size == 0) {
			System.out.println("The stack is empty");
			return;
		}
		Node node = top;
		while(node != null) {
			System.out.println(node.getValue() + " ");
			node = node.getNext();
		}
		System.out.println();
	}
}

public class StackUSingLinkedList {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedStack ls = new LinkedStack();
		ls.push(1);
		ls.push(2);
		ls.push(3);
		ls.display();
		System.out.println("Popped Element is : " + ls.pop());
		System.out.println("Peek Element is : " + ls.peek());
		System.out.println("Is Stack empty : " + ls.isEmpty());
		System.out.println("Size is : " + ls.getSize());
		ls.display();
	}
}