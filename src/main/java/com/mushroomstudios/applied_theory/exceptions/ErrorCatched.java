package com.mushroomstudios.applied_theory.exceptions;

/*
 * When executing Java code, different errors can occur: coding errors made by the 
 * programmer, errors due to wrong input, or other unforeseeable things.

	When an error occurs, Java will normally stop and generate an error message. 
	The technical term for this is: Java will throw an exception (throw an error).
 */
public class ErrorCatched {
	public int[] myNumbers = { 1, 2, 3 };

	public void catchGenericError() {
		try {
			System.out.println(myNumbers[10]); // error!
		} catch (Exception e) {
			System.out.println("index 10 does not exist, error was catched correctly");
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
	}

	/*
	 * The throw statement allows you to create a custom error.
	 * 
	 * The throw statement is used together with an exception type. There are many
	 * exception types available in Java: ArithmeticException,
	 * FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException,
	 * etc:
	 */

	public void checkAge(int age) {
		try {
			if (age < 18) {
				throw new ArithmeticException("Access denied - You must be at least 18 years old.");
			} else {
				System.out.println("Access granted - You are old enough!");
			}
		} catch (Exception e) {
			System.out.println("index 10 does not exist, error was catched correctly");
		}
	}
}
