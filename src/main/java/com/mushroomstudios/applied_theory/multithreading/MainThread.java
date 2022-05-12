package com.mushroomstudios.applied_theory.multithreading;

public class MainThread {

	public static void main(String[] args) {
		
		ThreadOne t1 = new ThreadOne();
		t1.run();
		
		ThreadTwo t2 = new ThreadTwo();
		t2.run();
	}

}
