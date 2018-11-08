import java.util.Stack;

/**
 * 
 */

/**
 * @author harini kumar
 *
 */
public class MinStackImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MinStack obj = new MinStack();
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

class MinStack {
	Stack<Integer> stack;
	int min;
    public MinStack() {
    	min = Integer.MAX_VALUE;
    	stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(x <= min) {
        	stack.push(min);
        	min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
    	if(stack.pop() == min)
    		min = stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}


