package com.tnsif.factorypattern;

public class Bike extends Vehicle{
	int wheel;
	Bike(int wheel) {
		this.wheel=wheel;
	}

	@Override
	public int getWheel() {
		// TODO Auto-generated method stub
		return this.wheel;
	}

}
