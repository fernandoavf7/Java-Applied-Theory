package com.mushroomstudios.applied_theory.constructors;

//we get the enum class for the unit used to measure our sphere
import com.mushroomstudios.applied_theory.Enums.Unit;

public class Sphere {

	
	private float radius;
	private Unit unit;
	
	// this is a constructor that receive parameters at moment to create the object
	public Sphere(float radius, Unit unit) {
		super();
		this.radius = radius;
		this.unit = unit;
	}

	/* this is an empty constructor that does not receive parameters at moment to create the object
	* it have default values */
	public Sphere() {
		super();
		this.radius = 0;
		this.unit = Unit.NOT_SET;
	}

	/*
	 * ToString method can be overrided for return the result of our object in a specific time,
	 * its useful for to know in a visible way the state of attributes
	 */
	@Override
	public String toString() {
		return "Sphere [radius=" + radius + ", unit=" + unit + "]";
	}
	
	
	
}
