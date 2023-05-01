package com.tnsif.designpattern;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Eager Initialization
//		SingletonEager instance = SingletonEager.getInstance();
//		System.out.println(instance);
//		SingletonEager instanceone = SingletonEager.getInstance();
//		System.out.println(instanceone);
		
		// Lazy Initialization
		SingletonLazy instance = SingletonLazy.getInstance();
		System.out.println(instance);
		SingletonLazy instanceone = SingletonLazy.getInstance();
		System.out.println(instanceone);

	}

}
