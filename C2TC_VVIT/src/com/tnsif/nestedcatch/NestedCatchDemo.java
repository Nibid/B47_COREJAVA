package com.tnsif.nestedcatch;
/*
 *  Program to demonstrate nested catch
 */
public class NestedCatchDemo {
	int arr[] = new int[6];// Declare an array
	void nestedCatch() {
		try {
			String str = null;
					str.equals("hai");
			arr[11] = 20/0;// Arithmetic exception occurred
			//arr[10] = 5;// Array out of bound exception
			System.out.println("try block");
		}
		catch(ArithmeticException a) {
			System.out.println("A number cannot be divided by zero "+a);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("A ccessing array element outside specified limit "+e);
		}
		catch(Exception e) {
			System.out.println("No exception match");
		}
	}
}
