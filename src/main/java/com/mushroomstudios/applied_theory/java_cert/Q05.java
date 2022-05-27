package com.mushroomstudios.applied_theory.java_cert;

import java.time.LocalTime;

public class Q05 {
	  public static void main(String[] args) {
	         LocalTime time = LocalTime.of(16, 40);
	         //String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
	         
	         //compilation error, if sentence above is not completed, must be in this way:
	         String amPm = time.getHour() >= 12 ? "PM" : "AM";
	         System.out.println(amPm);
	     }
}
