package com.tnsif.abstraction;

public class Rectangle extends Shape{
	float width,length;
	Rectangle() {
		this.width = 0.5f;
		this.length = 1.0f;
	}
	Rectangle(float width, float length) {
		this.width = width;
		this.length = length;
	}

	@Override
	void calArea() {
		// TODO Auto-generated method stub
		area = width*length;
		
	}

}
