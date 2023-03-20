package com.tnsif.constructors;
//Program to demonstrate constructor and getter and setter
public class Customer {
	private int customerId;
	private String customerName;
	private String customerCity;
	
	//default constructor
	public Customer() {
		//super();
		System.out.println("Default constructor");
	}

	//parameterized constructor
	public Customer(int customerId, String customerName, String customerCity) {
		//super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
		System.out.println("parameterized Const");
		System.out.println("id "+customerId+" name "+customerName+" city "+customerCity);
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

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", getCustomerId()=" + getCustomerId() + ", getCustomerName()=" + getCustomerName()
				+ ", getCustomerCity()=" + getCustomerCity() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
