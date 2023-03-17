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
		name = sc.nextLine();
		
		System.out.println("Enter the customer city");
		city = sc.nextLine();
		
		Customer ob = new Customer();
		ob.setCustomerId(id);
		ob.setCustomerName(name);
		ob.setCustomerCity(city);
		
	}

}
