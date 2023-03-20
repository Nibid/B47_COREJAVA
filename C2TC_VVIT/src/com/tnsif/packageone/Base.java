package com.tnsif.packageone;

public class Base {
	/*
	 * Declaring access specifiers
	 */
	int varDefault = 10;// no access specifier then it is default
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	/*
	 * Declaring access specifiers for methods
	 */
	void methodDefault() {// default method
		System.out.println("default access base class");
		System.out.println("default Variable "+varDefault);
	}
	public void methodPublic() {// default method
		System.out.println("public access base class");
		System.out.println("default Variable "+varPublic);
	}
	private void methodPrivate() {// default method
		System.out.println("private access base class");
		System.out.println("default Variable "+varPrivate);
	}
	protected void methodProtected() {// default method
		System.out.println("protected access base class");
		System.out.println("default Variable "+varProtected);
	}


}
