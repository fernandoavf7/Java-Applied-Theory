package com.mushroomstudios.applied_theory.inheritance;

//you have to import your inherited class
import com.mushroomstudios.applied_theory.encapsulation.Cube;

/*
 * CarbonCube inherit from Cube and get all its attributes and methods,
 * you can add its own attributes and methods too
 */
public class CarbonCube extends Cube {
	
	private boolean isDamaged;

	public boolean isDamaged() {
		return isDamaged;
	}

	public void setDamaged(boolean isDamaged) {
		this.isDamaged = isDamaged;
	}
	
	
}
