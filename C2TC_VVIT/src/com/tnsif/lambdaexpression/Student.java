package com.tnsif.lambdaexpression;

public class Student {
	int rollno;
	String name, address;
	

	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

	public int getRollNo() {
		// TODO Auto-generated method stub
		return rollno;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
