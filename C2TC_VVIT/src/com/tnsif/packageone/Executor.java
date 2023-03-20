package com.tnsif.packageone;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		//b.methodPrivate();//can't access outside the class
		
		b.varDefault = 21;
		b.methodDefault();
		/*
		 * b.varDefault = 21;
		 * b.methodDefault();
		 */
		b.varPublic = 65;
		b.methodPublic();
		System.out.println(b instanceof Base);

	}

}
