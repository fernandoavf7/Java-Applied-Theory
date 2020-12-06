package com.mushroomstudios.applied_theory.lists;

import java.util.LinkedList;

/*
 * linked list is a list where you can add any datatype, string int, float, boolean, etc
 */
public class LinkedLists {

	public LinkedList<String> cars = new LinkedList<String>();
	public LinkedList things = new LinkedList();

	//constructor
	public LinkedLists() {
		super();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    //System.out.println(cars);
	    
	    things.clear();
	    things.add("Bike");
	    things.add(56);
	    //things.addFirst("I am the first and I was added thirth");
	    things.add(true);
	    //things.addLast("I am the last item");
	    //System.out.println(things);
	    //things.removeFirst();
	    //things.removeLast();
	    things.getFirst();
	    things.getLast();
	    
	    
	}
    
	public void printList() {
		System.out.println(things);
	}
	
}
