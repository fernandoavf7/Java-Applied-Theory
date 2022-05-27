package com.mushroomstudios.applied_theory.java_cert;

import java.util.ArrayList;
import java.util.List;

class Student {
	private String name;
	private int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student[" + name + ", " + age + "]";
	}
}

public class Q07 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("James", 25));
		students.add(new Student("James", 27));
		students.add(new Student("James", 25));
		students.add(new Student("James", 25));

		/*
		 * remove the lowest index with given data
		 * so it will remove first and add a new at final too
		 */
		students.remove(new Student("James", 25));
		//students.set(0,new Student("James", 26));

		for (Student stud : students) {
			System.out.println(stud);
		}
	}
}
