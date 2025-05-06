package DSA;

import java.util.Stack;

public class STACK_Impl {
	
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("size of stack inisialy : "+stack.size());
		
//		stack.add(20);
//		stack.add(30);
//		stack.add(50);
//		stack.add(80);
//		
//		stack.push(300);
		
		System.out.println("size of stack after inswrting : "+stack.size());
		
		if(stack.size() > 0) {
			System.out.println("peek : "+stack.pop());
		} else {
			System.out.println("Stack is Empty !! can not peek");
		}
		
		if(stack.size() > 0) {
			System.out.println("pop : "+stack.pop());
		} else {
			System.out.println("Stack is Empty !! can not pop");
		}
		

		
		System.out.println("size of stack after inswrting : "+stack.size());
		
	}

}
