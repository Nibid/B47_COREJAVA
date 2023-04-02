package com.tnsif.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowsDemo.check();
		}
		catch(ArithmeticException e) {
			System.out.println("Caught the exc");
		}
		catch(IOException e1) {
			System.out.println("caught the IOexc");
		}
		catch(SQLException e) {
			//e.printStackTrace();
			System.out.println("caught the SQLexc");

	}
	}
}
