package com.mushroomstudios.applied_theory.recursion;

/*
 * Recursion its a technique used in programing when method is recalled
 * itself to reach a result, it should be used with caution
 * because it could generate errors
 */
public class Recursion {

	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}

	//overloaded method with 2 integers
	public static int sum(int start, int end) {
		if (end > start) {
			return end + sum(start, end - 1);
		} else {
			return end;
		}
	}
}
