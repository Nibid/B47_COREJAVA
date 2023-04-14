package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer>lhset = new LinkedHashSet<Integer>();
		lhset.add(10);
		lhset.add(40);
		lhset.add(20);
		lhset.add(70);
		lhset.add(60);
		lhset.add(30);
		lhset.add(10);
		lhset.add(null);
		lhset.add(null);
		System.out.println("LinkedHashSet :"+lhset);
		
//		Collections.sort(lhset); // CTE - cannot directly sort  HashSet/LinkedHashSet
		
		// Sort using ArrayList/TreeSet
		
		// Convert LinkedHashSet to an ArrayList
		ArrayList<Integer>array = new ArrayList<>(lhset);
		
		// Sort ArrayList
		Collections.sort(array);
		
		
		// Print after sort
		System.out.println("After sort: " + array);

	}

}
