package com.tnsif.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square();
		Rectangle r = new Rectangle();
		sq.calArea();
		sq.show();
		r.calArea();
		r.show();
		
		// Use the concept of function overloading
//		Shape sh = new Shape();
		// cannot create an object of abstract class
		
		Shape s = new Square(3.0f);// can create a reference and access it
		s.calArea();
		s.show();
		s = new Rectangle(10.0f,2.0f);
		s.calArea();
		s.show();

	}

}
