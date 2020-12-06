package com.mushroomstudios.applied_theory.inner_outter_class;

/*	outter class is a common class, while iner class is (as its name say it)
 * a intern class, a class into another class
 */
public class OuterClass {

	public int outterInt = 10;

	public class InnerClass {
		public int innerInt = 5;
		public int multiply(int a, int b) {
			return a*b;
		}
	}
}
