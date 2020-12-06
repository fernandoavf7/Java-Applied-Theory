package com.mushroomstudios.applied_theory.sorting;


/*
 * Here we have the bubble sort method and we are going to overload method 
 * to accept float.
 * 
 * About bubble sorting. Is a method that order comparing the adyacents numbers from first
 * to last number, first with second, second with third, third with fourth, etc
 * if algorithm found the first number compared is mayor to second one
 * it going to swap them of position, it do that until the array is fully ordered
 * 
 * Also those are static methods, so the array sent store the changes
 * so we dont have to do: myArray = bubbleSortInstance.order(myArray);
 * we can directly do: BubbleSort.order(myArray);
 */
public class BubbleSort {
	//this is used for int arrays
	public static void sort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}
}
