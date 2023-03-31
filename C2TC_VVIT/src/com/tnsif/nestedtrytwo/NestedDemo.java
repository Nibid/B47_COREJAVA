package com.tnsif.nestedtrytwo;

import java.util.Scanner;

public class NestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initializing the variable x and y from the user
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of x and y\n");
		int x = ob.nextInt();
		int y = ob.nextInt();
		
		// Initializing String variable with null value
        String ptr = null;
        
		System.out.println("value of x and y "+x+" "+y);
        
        NestedTry obj = new NestedTry();
		obj.nestedtry(x,y,ptr); 

	}

}
