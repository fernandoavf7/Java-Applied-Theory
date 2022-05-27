package com.mushroomstudios.applied_theory.java_cert;

class Point {
	int x;
	int y;

	void assign(int x, int y) {
		x = this.x;
		this.y = y;
	}

	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
}

public class Q12 {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		Point p2 = new Point();
		p2.assign(p1.x, p1.y);
		System.out.println(p1.toString() + ";" + p2.toString());

		/*
		 * answer is: Point(10, 20);Point(0, 20) because in Pojnt.assign this.x is not
		 * being set, so the value is the initial int value, in other words 0
		 */
	}
}
