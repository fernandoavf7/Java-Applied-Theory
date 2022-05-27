package com.mushroomstudios.applied_theory.java_cert;

public class Q16 {
	public static void main(String[] args) {
		String str = "java";
		StringBuilder sb = new StringBuilder("java");

		System.out.println(str.equals(sb) + ":" + sb.equals(str));
	}

	/*
	 * the answer is: false:false because stringBuilder is a mutable string
	 * characters
	 */
}
