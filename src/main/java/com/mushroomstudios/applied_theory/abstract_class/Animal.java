package com.mushroomstudios.applied_theory.abstract_class;

import com.mushroomstudios.applied_theory.Enums.Kind;

public abstract class Animal {

	private String name;
	private Kind kind;
	
	
	/*
	 * This is an abstract method, means that you are force to declare when you 
	 * inherit from this class because it will be differrent for all inherited classes
	 */
	public abstract String animalSound();

	// Regular methods
	public String sleep() {
		return "Zzzzz....";
	}
	
	public String wakeUp() {
		return "!!!";
	}
}
