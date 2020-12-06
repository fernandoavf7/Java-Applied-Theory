package com.mushroomstudios.applied_theory.lists;

import java.util.ArrayList;
import java.util.Collections;

/*
 * The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size 
of an array cannot be modified (if you want to add or remove elements to/from an array, 
you have to create a new one). While elements can be added and removed from an ArrayList 
whenever you want. The syntax is also slightly different:
 */
public class ArrayLists {

	public ArrayList<String> cars = new ArrayList<String>();
	ArrayList<Integer> myNumbers = new ArrayList<Integer>();

	public ArrayLists() {
		super();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		//System.out.println(cars);

		// common methods
		cars.get(0);
		cars.set(0, "Opel");
		cars.remove(0);
		//cars.clear();
		cars.size();
		Collections.sort(cars); // Sort cars

		myNumbers.add(10);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		Collections.sort(myNumbers);
	}
	
	public void printList() {
		System.out.println(cars);
	}

}
