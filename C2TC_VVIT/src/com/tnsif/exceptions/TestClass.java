package com.tnsif.exceptions;

import java.util.Scanner;

public class TestClass {
	private static int age;
	static void validate() throws Age {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		age = sc.nextInt();
		if(age < 10) {
			throw new Age("You are not eligible to vote");
		}else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate();// function which rise the exception
		} catch(Exception e) {
			System.out.println("Exception:\n "+e);
		}

	}

}
