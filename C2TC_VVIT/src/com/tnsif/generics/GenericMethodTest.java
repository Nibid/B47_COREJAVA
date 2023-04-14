package com.tnsif.generics;

public class GenericMethodTest {
	
	public <E> void displayArrayElements(E[] elements) {
		for(E ele:elements) {
			System.out.println("elements are "+ele);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethodTest obj = new GenericMethodTest();
		Integer[] intarr = {10,20,30};
		String[] strarr = {"java","program"};
		obj.displayArrayElements(intarr);
		obj.displayArrayElements(strarr);

	}

}
