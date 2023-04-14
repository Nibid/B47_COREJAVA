package com.tnsif.collections;

import java.util.LinkedHashSet;

public class LinkedHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer>set = new LinkedHashSet<>();
		for(int i=5;i>0;i--) {
			set.add(i);
		}
		for(int i: set) {
			System.out.println(i);
		}
	}

}
