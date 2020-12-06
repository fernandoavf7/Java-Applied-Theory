package com.mushroomstudios.applied_theory.lists;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * An Iterator is an object that can be used to loop through collections, 
 * like ArrayList and HashSet. It is called an "iterator" because "iterating" 
 * is the technical term for looping.
 */
public class Iterators {

	// Make a collection
	ArrayList<String> candies = new ArrayList<String>();

	public Iterators() {
		super();
		candies.add("Lemon pie");
		candies.add("Donut");
		candies.add("Cake");
		candies.add("Marshmallow");

		// Get the iterator
		Iterator<String> it = candies.iterator();

		// Print the first item
		//System.out.println(it.next()); // print Volvo
		//System.out.println(it.next()); // print BMW


		// how to remove items
		while (it.hasNext()) {
			String aux = it.next();
			if (aux == "Cake") {
				it.remove();
			}
		}
		
	}
	
	//print method
	public void printList() {
		Iterator<String> it = candies.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
}
