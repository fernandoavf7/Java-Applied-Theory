package com.mushroomstudios.applied_theory.design_patterns;

public class Singleton {
	/*
	 *  static variable single_instance of type Singleton, 
	 *  could contain any object or data types
	 */
	
    private static Singleton single_instance = null; 
  
    // variable of type String and int,
    //you can add all that you need
    public String s; 
    public int i;
  
    // private constructor restricted to this class itself 
    private Singleton() 
    { 
        s = "Hello I am a string, part of Singleton class"; 
    } 
  
    // static method to create instance of Singleton class 
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 
}
