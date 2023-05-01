package com.tnsif.designpattern;

public class SingletonEager {
	// When we are defining the variables at the same time we are declaring
	private static SingletonEager instance = new SingletonEager();
	private SingletonEager() {
		
	}

	public static SingletonEager getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}

}
