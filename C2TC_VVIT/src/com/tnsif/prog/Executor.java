package com.tnsif.prog;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass ob = new CarClass();// creation of object
		ob.forward();// calling the member function of the CarClass
		ob.backward();
		ob.stop();
		Scanner sc = new Scanner(System.in);// Created scanner class object
		System.out.println("enter the reg");
		int reg= sc.nextInt();
		
		System.out.println("Amount is "+ob.amt);
		
		System.out.println("REG is "+reg);
	}

}