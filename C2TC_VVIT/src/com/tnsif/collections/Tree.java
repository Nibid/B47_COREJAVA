package com.tnsif.collections;

import java.util.*;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer>set = new TreeSet<>();
		for(int i=5;i>0;i--) {
			set.add(i);
		}
		for(int i: set) {
			System.out.println(i);
		}

	}

}
