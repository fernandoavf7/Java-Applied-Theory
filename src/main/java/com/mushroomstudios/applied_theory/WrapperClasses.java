package com.mushroomstudios.applied_theory;

import java.util.ArrayList;

/*
 * Wrapper classes provide a way to use primitive 
 * data types (int, boolean, etc..) as objects.
 * 
 * Primitive Data Type	 || Wrapper Class
					byte	Byte
					short	Short
					int		Integer
					long	Long
					float	Float
					double	Double
					boolean	Boolean
					char	Character

 */
public class WrapperClasses {

	//constructor
	public WrapperClasses() {
		//ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
		ArrayList<Integer> integers = new ArrayList<Integer>(); // Valid
		//examples
		ArrayList<Byte> a = new ArrayList<Byte>(); // Valid
		ArrayList<Short> b = new ArrayList<Short>(); // Valid
		ArrayList<Long> c = new ArrayList<Long>(); // Valid
		ArrayList<Float> d = new ArrayList<Float>(); // Valid
		ArrayList<Double> e = new ArrayList<Double>(); // Valid
		ArrayList<Boolean> f = new ArrayList<Boolean>(); // Valid
		ArrayList<Character> g = new ArrayList<Character>(); // Valid
	}
	
}
