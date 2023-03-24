package com.tnsif.staticmethod;

public class MyClass {
	private int section;// instance variable
	private static int srNo;// static variable
	
	static {// static block
		System.out.println("inside static block");
		srNo=100;
	}
	MyClass() {// default constructor
		System.out.println("Default Constructor");
		srNo++;// non-static methods or constructor can access static variables
		section++;
	}
	static void display() {
//		System.out.println("section"+section);
//		Cannot make a static reference to the non-static field section
		System.out.println("serial number "+srNo);
	}
}
