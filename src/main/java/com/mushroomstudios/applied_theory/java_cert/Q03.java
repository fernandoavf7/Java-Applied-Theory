package com.mushroomstudios.applied_theory.java_cert;

class SpecialString {
	String str;

	SpecialString(String str) {
		this.str = str;
	}
}

public class Q03 {
	public static void main(String[] args) {
		Object[] arr = new Object[4];
		for (int i = 1; i <= 3; i++) {
			switch (i) {
			case 1:
				arr[i] = new String("Java");
				break;
			case 2:
				arr[i] = new StringBuilder("Java");
				break;
			case 3:
				arr[i] = new SpecialString("Java");
				break;
			}
		}
		for (Object obj : arr) {
			System.out.println(obj);
		}

		/* the result:
		 * null 
		 * Java 
		 * Java
		 * com.mushroomstudios.applied_theory.java_cert.SpecialString@156643d4
		 */
		
		/*
		 * index 0 is null
		 * index 1 has normal String class
		 * index 2 has stringBuilderClass
		 * index 3 has a normal String but given name in the outer class, so it has a reference and the value is stored internally
		 */
	}
}
