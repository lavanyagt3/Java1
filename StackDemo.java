package Collections;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.push(10);
		stack.push(20); 
		stack.push(30); 
		stack.push(40); 
	
		System.out.println("stack after pushes" + stack);
		
		System.out.println("top element "+ stack.peek());
		
		System.out.println("pop operation " +stack.pop());
		System.out.println(stack);
				
		System.out.println("stach is empty "+ stack.isEmpty());

		int position =stack.search(20);
		if(position !=-1)
		{
			System.out.println("Element found in " + position + " index pos");
		}
		else
		{
			System.out.println("Element not found " + position);
		}
	}

}