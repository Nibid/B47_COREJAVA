package com.tnsif.exceptions;

public class DemoThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		for(n = 1; n <= 2; n++) {
			try {
				if(n == 5) {
					throw new ArithmeticException("ArithmeticException");
				}
				else if(n < 2) {
					throw new RuntimeException("RuntimeException");
				}
				else if(n > 9) {
					throw new NullPointerException("NullPointerException");
				}
			} catch(NullPointerException e) {
				System.out.println("Caught an exception");
			}
		}

	}

}
