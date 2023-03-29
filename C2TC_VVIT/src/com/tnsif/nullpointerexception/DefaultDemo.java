package com.tnsif.nullpointerexception;

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = null;
		try {
			a.equals("hello");
		}
		catch(Exception e) {
			System.out.println("Null pointer Exception");
		}

	}

}
