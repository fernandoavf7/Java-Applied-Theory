package com.mushroomstudios.applied_theory.interfaces;

/*
 * when you inherit from an interface, you dont extends, you implements from it,
 * you are force to implement the methods from your implemented interface or
 * you will get an error
 */
public class MyCar implements Car {

	public int currentSpeed = 0;
	public boolean isStarted = false;
	
	public void start() {
		isStarted = true;
		System.out.println("Car Started...");
	}

	public void stop() {
		isStarted = false;
		currentSpeed = 0;
		System.out.println("Car Stoped...");
	}

	public void speedUp() {
		if(isStarted) {
			currentSpeed++;
			System.out.println("Car speed: "+currentSpeed);
		}else {
			System.out.println("Car is stopped!");
		}
	}

	public void speedDown() {
		if(isStarted) {
			currentSpeed--;
			System.out.println("Car speed: "+currentSpeed);
		}else {
			System.out.println("Car is stopped!");
		}
	}

}
