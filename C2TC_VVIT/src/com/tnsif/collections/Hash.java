package com.tnsif.collections;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashSet object.
		HashSet<String>set = new HashSet<String>();// An empty hash set.
		
		// Adding elements to HashSet.
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fifth");
		System.out.println("No order will be maintained "+set);
		
		// Adding duplicate elements that will be ignored.
		set.add("First");
		set.add("Third");
		System.out.println("No duplicate Elements "+set);
		
		// Adding of null elements.
		set.add(null);
		set.add(null); // ignored
		System.out.println("Unordered and No Duplicate HashSet Elements");
		System.out.println(set);
	}

}
