package com.mushroomstudios.applied_theory.java_cert;

public class Q26 {
	public static void main(String[] args) {
		/* INSERT */

		/*
		 * there are 3 options to compile correctly
		 */

		// short arr [] = new short[2];

		byte[] arr = new byte[10]; // ok

		// short [] arr; arr = new short[3]; ok

		// short [2] arr;

		// short [3] arr;

		// int [] arr = new int[]{100, 100};

		// int [] arr = new int[]{0, 0, 0, 0}; ok

		// short [] arr = {};

		// short [] arr = new short[2]{5, 10};

		arr[1] = 5;
		arr[2] = 10;
		System.out.println("[" + arr[1] + ", " + arr[2] + "]"); // Line n1
	}
}
