package DSA;

public class My_STACK_Impl {
	
	public int maxSize;
	public int peek;
	public int[] stack;
	
	public My_STACK_Impl(int size) {
		stack = new int[size]; 
		this.maxSize = size;
		peek = -1;
	}
	
	public boolean isStackFull() {
		if(peek >= maxSize-1) {
			return true;
		} 
		return false;
	}
	
	public boolean isStackEmpty() {
		if(peek == -1) {
			return true;
		}
		return false;
	}
	
	public boolean push(int val) {
		if(!isStackFull()) {
			stack[++peek] = val;
			System.out.println(val +" Pushed at peek = "+peek);
			return true;
		} else
			System.out.println("Can not Pushed "+val +" due to stack full..");
		return false;
	}
	
	public void pop() {
		if(!isStackEmpty()) {
			int val = stack[peek];
			peek--;
			System.out.println("Poped Element = "+val);
		} else
			System.out.println("Stack is Empty..can not pop.");
	}
	
	
	public void peek() {
		if(!isStackEmpty()) {
			System.out.println("Peek Element = "+stack[peek]);
		} else
			System.out.println("Stack is Empty..");

	}
	
	
	public static void main(String[] args) {
		
		My_STACK_Impl stack = new My_STACK_Impl(5);
		
		stack.peek();
		stack.pop();
		
		System.out.println("before all inserting stack size "+(stack.peek + 1));
		
		stack.push(10);
		stack.push(67);
		stack.push(90);
		
		System.out.println("In middle stack size "+(stack.peek + 1));		
		
		stack.push(100);
		stack.push(900);
		stack.push(600);
		
		System.out.println("after all inserting stack size "+(stack.peek + 1));
		
		System.out.println("after all inserting ...");
		stack.peek();
		stack.pop();
		
		
		System.out.println(" in last stack size "+(stack.peek + 1));
		
	}

}
