package com.tnsif.nestedtrytwo;

public class NestedTry {
	int nestedtry(int x, int y, String ptr)
	{
		int z = 0;
		try
	    {
			if (ptr.equals("gfg"))
	            System.out.println("Same");
	        else
	            System.out.println("Not Same");
			
			try {
				z = x/y;
				System.out.println(z);
			}
			catch(ArithmeticException ar) {
				System.out.println("ArithmeticException");
			}
			
	    }
	    catch(NullPointerException e)
	    {
	        System.out.println("NullPointerException");
	    }
		return z;
}

}
