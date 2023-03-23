package com.tnsif.clz;

import cm.tnsif.std.Std;

public class Clz extends Std {
	void display() {
		name();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of class student from package 2
		Std s = new Std();
		Clz obj = new Clz();
		obj.display();
		// s.name();
		// The method name() from the type Std is not visible
	}

}
