package com.tnsif.staticprogram;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob1 = new Employee();
		System.out.println(Employee.companyName);
		
		Employee ob = new Employee("raj",123);
		System.out.println(ob);
		
		Employee ob2 = new Employee();
		System.out.println(Employee.companyName);
		
		ob = new Employee("suman",456);
		System.out.println(ob);
		
	}

}




