package com.tnsif.nestedtrytwo;
/*
 * demonstrate that invoking ArithmeticException & NullPointerException nested
 */
public class NestedTry {
	int nestedtry(int x, int y, String ptr)
	{
		int z = 0;
		// outer (main) try block  
		try
	    {
			// Checking if ptr.equals null or works fine.
			if (ptr.equals("Hello"))
	            System.out.println("Same");
	        else
	            System.out.println("Not Same");
			
			//inner try block
			try {
				z = x/y;
				System.out.println(z);
			}
			// to handles ArithmeticException 
			catch(ArithmeticException ar) {
				System.out.println("ArithmeticException");
			}
			
	    }
		// This line of code throws NullPointerException
        // because ptr is null
	    catch(NullPointerException e)
	    {
	        System.out.println("NullPointerException");
	    }
		return z;
}

}
