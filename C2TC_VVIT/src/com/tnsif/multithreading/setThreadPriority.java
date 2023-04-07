package com.tnsif.multithreading;

public class setThreadPriority extends Thread{
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " start");
		System.out.println("Thread with priority" + Thread.currentThread().getPriority() + " running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setThreadPriority t1 = new setThreadPriority();// created 3 objects
		setThreadPriority t2 = new setThreadPriority();
		setThreadPriority t3 = new setThreadPriority();
		
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(8);
		t1.start();
		t2.start();
		t3.start();

	}

}
