package com.mushroomstudios.applied_theory.example_classes;

import com.mushroomstudios.applied_theory.abstract_class.Animal;

/* this is a class inherited from an abstract class, so java force you
 * to implement all abstract methods 
 */
public class Dog extends Animal{

	
	//method will be overrided because abstract method exists, but with an empty body
	@Override
	public String animalSound() {
		return "GUAU!!!";		
	}

}
