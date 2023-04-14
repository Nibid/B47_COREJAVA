package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student>st = new ArrayList<Student>();
		st.add(new Student(222,"aaa","bang"));
		st.add(new Student(111,"bbb","mang"));
		st.add(new Student(333,"acc","delhi"));
		System.out.println(st);
		
		//Unsorted Array
		System.out.println("unsorted array");
		for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i));
		}
		
		//Sorted by Roll no	
		Collections.sort(st, new SortByRollNo());
		System.out.println("Sorting by Roll No");
		for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i));
		}
		
		//Sorted by Name
		Collections.sort(st,new SortByName());
		System.out.println("Sorting by Name");
		for(int i=0;i<st.size();i++) {
		System.out.println(st.get(i));
		}

	}

}
