package com.mushroomstudios.applied_theory.lists;

import java.util.HashMap;

/*
 * In the ArrayList chapter, you learned that Arrays store items as an ordered collection, 
 * and you have to access them with an index number (int type). A HashMap however, 
 * store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

	One object is used as a key (index) to another object (value). It can store 
	different types: String keys and Integer values, or the same type, 
	like: String keys and String values:
 */
public class Hashmaps {

	HashMap<String, String> capitalCities = new HashMap<String, String>();

	public Hashmaps() {
		super();
		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		//System.out.println(capitalCities);

		// common methods
		capitalCities.get("England");
		capitalCities.get(0);
		capitalCities.remove("England");
		capitalCities.size();

		// Print keys
		for (String i : capitalCities.keySet()) {
			//System.out.println(i);
		}

		// Print values
		for (String i : capitalCities.values()) {
			//System.out.println(i);
		}

		// Print keys and values
		for (String i : capitalCities.keySet()) {
			//System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}

		// Create a HashMap object called people
		HashMap<String, Integer> people = new HashMap<String, Integer>();
	}
	
	public void printList() {
		System.out.println(capitalCities);
	}

}
