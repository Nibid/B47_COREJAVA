package com.tnsif.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {
	static void check() throws ArithmeticException, IOException, SQLException {
		System.out.println("Inside the check function");
		throw new ArithmeticException();
		//throw new IOException();
		//throw new SQLException();
		
	}

}
