package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating an array list
		ArrayList<String> vvit = new ArrayList<String>();
		System.out.println(vvit);// display the ArrayList
		vvit.add("Nibid");
		vvit.add(null);
		vvit.add("Raj");
		vvit.add("Shrestha");
		System.out.println(vvit);
		
		// remove element of particular index(1)
		vvit.remove(1);
		System.out.println(vvit);
		
		// traversing the list
		for(String element:vvit) {
			System.out.println(element);
			
		}
		// display size of ArrayList object
		System.out.println("Total Element "+vvit.size());
		
		// sorting the elements of ArrayList
		Collections.sort(vvit);
		System.out.println(vvit);
		
		// reversing the elements of ArrayList
		Collections.reverse(vvit);
		System.out.println(vvit);
		
		// clearing the elements of ArrayList
		vvit.clear();
		System.out.println(vvit);

	}

}
