package com.tnsif.collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list =  new LinkedList<String>();// created an object of type string

		//Adding Elements to the Linked List
		list.add("John");
		list.add("Raj");
		list.add("Amar");
		System.out.println(list);
		
		//Adding an element to the first position
		list.addFirst("Akhar");
		
		//Adding an element to the last position
		list.addLast("Anthony");
		System.out.println(list);
		
		//Adding an element to the 2nd position
		list.add(2,"Anthony");
		list.add(2,"steve");
		System.out.println(list);
		
		//Removing an element in the 2nd position
		list.remove(2);
		System.out.println(list);
		
		//Iterating LinkedList
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
