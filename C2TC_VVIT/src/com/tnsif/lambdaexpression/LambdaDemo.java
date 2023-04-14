package com.tnsif.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaDemo {

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
		Comparator<Student> sortByRollNo = (a, b) -> a.getRollNo() - b.getRollNo();
		Collections.sort(st, sortByRollNo);
		System.out.println("Sorting by Roll No");
		for(int i=0;i<st.size();i++) {
		System.out.println(st.get(i));
		}
				
		//Sorted by Name
		Comparator<Student> sortByName = (a, b) -> a.getName().compareTo(b.getName());
		Collections.sort(st, sortByName);
		System.out.println("Sorting by Name");
		for(int i=0;i<st.size();i++) {
		System.out.println(st.get(i));
		}
	}
}
