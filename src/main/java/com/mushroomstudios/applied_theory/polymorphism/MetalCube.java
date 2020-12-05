package com.mushroomstudios.applied_theory.polymorphism;

//get the father class
import com.mushroomstudios.applied_theory.encapsulation.Cube;

public class MetalCube extends Cube {

	/*
	 * Here we are aplying polymorphism to this class, the father class return message that say: "I am a generic cube"
	 * and we change this to tell "I am a Metal Cube"
	 */
	public String getCubeType() {
		return "I am a Metal Cube";
	}
}
