package com.tnsif.multithreading;

public class MultiThread extends Thread{
	//Declare a STring variable to represent task
	String task;
	
	MultiThread(String task) {
		this.task = task;
	}
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(task+ " : " +i);
			try {
				Thread.sleep(1000); // Pause the thread execution for 1000 milliseconds
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}// end of for loop
	}// end of run() method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create two objects to represent two tasks
		MultiThread th1 = new MultiThread("Cut the ticket"); // Passing task 
		MultiThread th2 = new MultiThread("Show your seat number");
		
		//Create two objects of Thread class and pass two objects as parameter
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		t1.start();
		t2.start();
	}

}
