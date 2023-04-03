package com.tnsif.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CreatingThreadOne t = new CreatingThreadOne();// new state
//		t.start();// implicit
//		//t.start();
//		t.run();// explicit
		
		// Creating an object of my class and pass that object to thread class
		CreatingThreadTwo mc = new CreatingThreadTwo();
		Thread t = new Thread(mc);
		t.run();
	}

}
