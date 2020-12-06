package com.mushroomstudios.applied_theory.lists;

import java.util.HashSet;

/*
 * A HashSet is a collection of items where every item is unique,
 */
public class Hashsets {
	public HashSet<String> guitars = new HashSet<String>();

	public Hashsets() {
		super();

		guitars.add("Stratocaster");
		guitars.add("Warlock");
		guitars.add("Ovation");
		guitars.add("Explorer");
		guitars.add("Warlock"); // repeated
		guitars.add("Telecaster");
		// this dont print BMW twice, because its does not stored it twice
		//System.out.println(guitars);

		// common methods
		guitars.contains("Ovation");// return true or false
		guitars.remove("Telecaster");// return true if item was removed, false if not
		//guitars.clear();
		guitars.size();

		// print hashset
		for (String i : guitars) {
			//System.out.println(i);
		}
	}
	
	public void printList() {
		System.out.println(guitars);
	}
}
