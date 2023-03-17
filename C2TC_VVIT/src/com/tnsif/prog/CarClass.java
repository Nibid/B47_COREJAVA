package com.tnsif.prog;
/*
 * Program to demonstrate class and objects with data encapsulation
 */
public class CarClass {
	// Data members for the class
	int model;
	String color;
	int reg;
	int amt=10000;
	// Member functions for the class
	
	CarClass() {
		System.out.println("Model "+model+" Reg "+reg);
	}
	void forward() {
		System.out.println("Car is moving in forward direction");
	}
	void backward() {
		System.out.println("Car is moving in backward direction");
	}
	void stop() {
		System.out.println("Car is not moving");
	}
}
