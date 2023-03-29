package com.tnsif.exceptions;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int d = 0;
//		int a = 48/d;// exception occurred here
//		System.out.println("Sorry i can't work");
		
		int d = 0,a;
		try {
			a = 22/d;// exception occurred here
			System.out.println("This will not be printed");
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		System.out.println("This will be printed");
	}

}
