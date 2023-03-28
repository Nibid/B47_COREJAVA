package com.tnsif.interfaces;
/*
 * Program to demonstrate interface
 */
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle(2.5f, 10.0f);
		System.out.println("area "+s.calArea());
		System.out.println("perimeter "+s.calPerimeter());

	}

}
