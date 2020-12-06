package com.mushroomstudios.applied_theory;

import java.awt.dnd.peer.DragSourceContextPeer;

import com.mushroomstudios.applied_theory.Enums.Unit;
import com.mushroomstudios.applied_theory.constructors.Sphere;
import com.mushroomstudios.applied_theory.encapsulation.Cube;
import com.mushroomstudios.applied_theory.example_classes.Dog;
import com.mushroomstudios.applied_theory.inheritance.CarbonCube;
import com.mushroomstudios.applied_theory.multithreading.ThreadOne;
import com.mushroomstudios.applied_theory.multithreading.ThreadTwo;
import com.mushroomstudios.applied_theory.overload.BubbleSortOverloaded;
import com.mushroomstudios.applied_theory.polymorphism.MetalCube;
import com.mushroomstudios.applied_theory.singleton.Singleton;
import com.mushroomstudios.applied_theory.sorting.BubbleSort;
import com.mushroomstudios.applied_theory.sorting.HeapSort;
import com.mushroomstudios.applied_theory.sorting.InsertionSort;
import com.mushroomstudios.applied_theory.sorting.MergeSort;
import com.mushroomstudios.applied_theory.sorting.QuickSort;

/**
 * This code was developed by Fernando Vera.
 * 
 * You can have more main methods for proyect, but you have to choose which run
 */
public class App {
	/* you can try the classes here, print that you want! */
	public static void main(String[] args) {

		// encapsulation test
		Cube cube = new Cube();
		cube.material = "Wood";
		// you can't set cube weight through cube.weight because is a protected
		// attribute
		// you can't set cube height, width or deep through cube.height, cube.width
		// or cube.deep because is a protected attribute
		// so you have to use your mutators and accessors methods
		cube.setWeight(362.56);
		cube.setDeep(150);
		cube.setHeight(150);
		cube.setWidth(150);
		System.out.print(cube.toString());
		System.out.println(" " + cube.getCubeType());

		// inheritance test
		CarbonCube carbonCube = new CarbonCube();
		carbonCube.setDamaged(true);
		System.out.println("Carbon cube damage: " + carbonCube.isDamaged());

		// constructor test
		Sphere sphere = new Sphere(12.5f, Unit.CMS);
		System.out.println(sphere.toString());

		// polymorphism test
		MetalCube metalCube = new MetalCube();
		System.out.println(metalCube.getCubeType());
		System.out.println("\n");

		// singleton
		// instantiating Singleton class with variable x
		Singleton x = Singleton.getInstance();
		// instantiating Singleton class with variable y
		Singleton y = Singleton.getInstance();
		// instantiating Singleton class with variable z
		Singleton z = Singleton.getInstance();
		// changing variable of instance x
		x.s = (x.s).toUpperCase();
		x.i = 99;

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("int from x is " + x.i);
		System.out.println("\n");
		// changing variable of instance z
		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		// Bubble sort method
		int integerArray[] = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println("integerArray before Bubble Sort");
		printArray(integerArray);
		System.out.println("\n");
		System.out.println("integerArray after Bubble Sort");
		BubbleSort.sort(integerArray);
		printArray(integerArray);
		System.out.println("\n");

		// insertion sort
		int integerArray2[] = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println("integerArray2 after Insertion Sort");
		InsertionSort.sort(integerArray2);
		printArray(integerArray2);
		System.out.println("\n");

		// Quick sort
		int integerArray3[] = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println("integerArray3 after Quick Sort");
		QuickSort.sort(integerArray3, 0, integerArray3.length - 1);
		printArray(integerArray3);
		System.out.println("\n");

		// Heap sort
		int integerArray4[] = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println("integerArray4 after Heap Sort");
		HeapSort.sort(integerArray4);
		printArray(integerArray4);
		System.out.println("\n");

		// Merge sort
		int integerArray5[] = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println("integerArray5 after Merge Sort");
		MergeSort.sort(integerArray5, 0, integerArray5.length - 1);
		printArray(integerArray5);
		System.out.println("\n");

		// test overload for bubblesort with float, we call same method and java
		// select the correct one
		float floatArray[] = { 3.9f, 60f, 35.99f, 27.945f, 45f, 320.3459f, -78.7f, 9f };
		System.out.println("floatArray before Bubble Sort");
		printArray(floatArray);
		System.out.println("\n");
		System.out.println("floatArray after Bubble Sort");
		BubbleSortOverloaded.sort(floatArray);
		printArray(floatArray);
		System.out.println("\n");

		// Multithreading
		ThreadOne t1 = new ThreadOne();
		Thread thread1 = new Thread(t1);
		thread1.start();

		ThreadTwo t2 = new ThreadTwo();
		t2.start();
		System.out.println("\n");
		
		//Abstract class implementation example
		Dog dog = new Dog();
		//System.out.println("This is an class inherited from an abstract class, it's a dog and makes: "+dog.animalSound());
		//System.out.println("\n");

	}// end main

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	//method overloaded
	private static void printArray(float[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}// end class
