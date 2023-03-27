package com.tnsif.abstraction;

public class Square extends Shape{
	float width,side;
	Square() {
		this.side = 1.0f;
	}
	Square(float side) {
		this.side = side;
	}


	@Override
	void calArea() {
		// TODO Auto-generated method stub
		area = side*side;
	}

}
