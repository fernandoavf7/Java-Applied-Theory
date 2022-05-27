package com.mushroomstudios.applied_theory.java_cert;

public class Q10 {
	public static void main(String[] args) {
		/*
		 * in the example below, we are giving the capacity of stringbuilder, so this
		 * doesnt affect the text into it
		 * 
		 */
		StringBuilder sb = new StringBuilder(100);
		System.out.println(sb.length() + ":" + sb.toString().length());
	}
}
