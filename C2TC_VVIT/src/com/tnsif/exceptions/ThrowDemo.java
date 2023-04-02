package com.tnsif.exceptions;

public class ThrowDemo {
	static void avg() {
		System.out.println("avg is throwing");
//		ArithmeticException ae = new ArithmeticException();
//		throw ae;
		throw new ArithmeticException("done");
	}

}
