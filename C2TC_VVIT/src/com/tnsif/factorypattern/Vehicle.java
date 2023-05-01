package com.tnsif.factorypattern;

abstract class Vehicle {
	public abstract int getWheel();
	public String toSTring() {
		return "Wheel"+this.getWheel();
	}

}
