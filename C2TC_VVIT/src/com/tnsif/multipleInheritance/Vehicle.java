package com.tnsif.multipleInheritance;

public class Vehicle implements VehicleOne, VehicleTwo {

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		int speed = distance/100;
		System.out.println("speed "+speed);
	}

	@Override
	public void distance() {
		// TODO Auto-generated method stub
		int distance = speed*100;
		System.out.println("distance travelled "+distance);
		
	}

}
