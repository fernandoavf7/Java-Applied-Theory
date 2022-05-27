package com.mushroomstudios.applied_theory.java_cert;

public class Q21 {

	public static void main(String[] args) {
		double price = 90000;
		String model;

		model = "no model"; // java needs that String be initialized or not compile
		if (price > 100000) {
			model = "Tesla Model X";
		} else if (price <= 100000) {
			model = "Tesla Model S";
		}
		System.out.println(model);
	}
}
