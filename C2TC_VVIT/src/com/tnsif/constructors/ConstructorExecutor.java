package com.tnsif.constructors;

import java.util.Scanner;

public class ConstructorExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int id;
		String name,city;
		
		System.out.println("Enter the customer id");
		id = sc.nextInt();
		
		System.out.println("Enter the customer name");
		name = sc.next();// read the line
		sc.nextLine();// this is to process the new line
		
		System.out.println("Enter the customer city");
		city = sc.nextLine();
		
		//Default Constructor will be invoked
//		Customer c1 = new Customer();
//		c1.setCustomerId(id);
//		c1.setCustomerName(name);
//		c1.setCustomerCity(city);
//		System.out.println(c1.getCustomerId()+" "+c1.getCustomerName()+" "+c1.getCustomerCity());
		
		
		//Parameterized Constructor will be invoked
		Customer c2 = new Customer(id,name,city);
	}

}
