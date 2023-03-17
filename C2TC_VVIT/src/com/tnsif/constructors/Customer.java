package com.tnsif.constructors;
//Program to demonstrate constructor and getter and setter
public class Customer {
	private int customerId;
	private String customerName;
	private String customerCity;
	
	//default constructor
	public Customer() {
		//super();
	}

	//parameterized constructor
	public Customer(int customerId, String customerName, String customerCity) {
		//super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

}
