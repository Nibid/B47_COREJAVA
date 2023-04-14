package com.tnsif.lambdaexpression;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement s=()->{
			return "Hello World";
			};
			System.out.println(s.greet());

	}

}
