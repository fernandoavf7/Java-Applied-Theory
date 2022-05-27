package com.mushroomstudios.applied_theory.java_cert;

class Message {
	String msg = "Happy New Year!";

	public void print() {
		System.out.println(msg);
	}
}

public class Q09 {
	public static void change(Message m) { // Line n5
		m = new Message(); // Line n6
		m.msg = "Happy Holidays!"; // Line n7
	}

	public static void main(String[] args) {
		Message obj = new Message(); // Line n1
		obj.print(); // Line n2
		change(obj); // Line n3
		obj.print(); // Line n4

		/*
		 * it returns: 
		 * Happy New Year! 
		 * Happy New Year!
		 * 
		 * because public static void change return void and msg is in other class
		 */
	}
}