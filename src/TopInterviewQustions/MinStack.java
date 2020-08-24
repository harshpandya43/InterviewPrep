package TopInterviewQustions;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();
	
	public void push(int x) {
		stack.push(x);
		
		if(minStack.isEmpty() || x<=getMin()) {
			minStack.push(x);
		}
	}
	
	public void pop() {
		if(stack.isEmpty()) {
			return;
		}
		
		int x = stack.pop();
		if(x == minStack.peek()) {
			minStack.pop();
		}
	}
	
	public int top() {
		return stack.peek();
	}
	
	public int getMin() {
		return minStack.peek();
	}

}
