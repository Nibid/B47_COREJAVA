package com.tnsif.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point ob = new Point();
		System.out.println(ob);
		Point ob1 = new Point(14.5f);
		System.out.println(ob1);
		Point obj = new Point(14.5f,2.5f);
		System.out.println(obj);

	}

}
