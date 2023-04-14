package com.tnsif.collections;

import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>obj = new Stack<>();//created wrapper class object ie obj
		
		//push operation
		obj.push(0);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(100);
		obj.add(66);
		System.out.println("Elements of the stack"+ obj);
		
		//pop element
		obj.pop();
		obj.pop();
		
		//for each
		for(int temp: obj) {
			System.out.println(temp);
		}
		
		// peek() is used to print last element of stack
		System.out.println("Last element is: "+obj.peek());
		
		// Search the Stack
		if(obj.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
		
		// Search element
		System.out.println(obj.search(0)); // 5
		System.out.println(obj.search(100)); // -1
		

	}

}
