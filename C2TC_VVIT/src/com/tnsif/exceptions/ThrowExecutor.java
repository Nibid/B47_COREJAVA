package com.tnsif.exceptions;

public class ThrowExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowDemo.avg();
		}
		catch(ArithmeticException e) {
			System.out.println("caught"+e);
		}

	}

}
