import java.util.*;
public class Main8{
	public static void main(String[] args){
		Stack<Integer> stack= new Stack<>();
		stack.push( 1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		System.out.println(stack);
		/*
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		Integer removedElement = stack.pop(); 
		System.out.println(stack);
		Integer peek = stack.peek();
		System.out.println(peek);
		System.out.println(stack);
		*/
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		
		int search= stack.search(3);
		System.out.println(search);
	}
}
		
