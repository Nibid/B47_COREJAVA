package com.tnsif.methodoverriding;

import com.tnsif.methodoverriding.Override.override;

class base{
	
	void sum() {
		System.out.println("Sum ");
	}
}
public class Override extends base{
	public @interface override {

	}

	@override
	void sum() {
		
	}

}
