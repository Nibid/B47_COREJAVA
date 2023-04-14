package com.tnsif.generics;

public class GenericInterfaceDemo implements MyInterface<String>{
	
	@Override
	public String display(String arg) {
		// TODO Auto-generated method stub
		return "Hello " + arg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericInterfaceDemo myObj = new GenericInterfaceDemo();
        System.out.println(myObj.display("World"));

	}

}
