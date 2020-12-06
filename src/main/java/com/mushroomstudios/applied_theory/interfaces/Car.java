package com.mushroomstudios.applied_theory.interfaces;
/*
 * An interface is another way to achieve abstraction in a java class
 * all that you declare here should be abstract and implemented in the
 * implemented class
 */
public interface Car {

	//only constants are accepted in interfaces
	public String brand = "Vera";
	
	public void start();
	public void stop();
	public void speedUp();
	public void speedDown();
	
}
