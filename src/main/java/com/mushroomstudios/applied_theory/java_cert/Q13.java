package com.mushroomstudios.applied_theory.java_cert;

public class Q13 {
	private static void m(int x) {
		System.out.println("int version");
	}

	private static void m(char x) {
		System.out.println("char version");
	}

	public static void main(String [] args) {
	         int i = '5';
	         m(i);
	         m('5');
	     }

	/*
	 * int assingn value doesnt give compilation error because int is taking the
	 * value from character 5 and not the value integer 5
	 */
	
}
