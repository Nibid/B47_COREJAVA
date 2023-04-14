package com.tnsif.vector;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new vector
        Vector <Integer> v = new Vector<Integer>();
 
        // Add elements to the vector
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
 
        // Insert an element at index 1
        v.insertElementAt(0, 1);
 
        // Remove the element at index 2
        v.removeElementAt(2);
 
        // Print the elements of the vector
         System.out.println(v);
         
        // Print the capacity of the vector
         v.capacity();
         System.out.println(v);
         
        // Print the component at the specified index.
         v.elementAt(3);
         System.out.println(v);
         
        // Removes all the elements from the vector
         v.clear();
         System.out.println(v);
        }
    }

