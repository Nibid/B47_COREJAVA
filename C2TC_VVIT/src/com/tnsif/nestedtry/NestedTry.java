package com.tnsif.nestedtry;

public class NestedTry {
	int nestedtry(int x, int y)
	{
		int z = 0;
		try {
		z = x/y;
		System.out.println(z);
	}
		catch(ArithmeticException ar) {
			System.out.println("exception");
			
		}
		return z;
	}

}
