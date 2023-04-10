package com.tnsif.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Laptop>laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell",16,80000));
		laps.add(new Laptop("Asus",32,160000));
		laps.add(new Laptop("Hp",8,40000));
		Collections.sort(laps);
		for(Laptop l:laps) {
			System.out.println(l);
		}

	}

}
