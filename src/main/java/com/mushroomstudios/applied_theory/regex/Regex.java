package com.mushroomstudios.applied_theory.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * A regular expression is a sequence of characters that forms a search pattern. 
 * When you search for data in a text, you can use this search pattern to describe what you are searching for.

	A regular expression can be a single character, or a more complicated pattern.
	
	Regular expressions can be used to perform all types of text search and text 
	replace operations.
 */
public class Regex {

	/*
	 * basic example
	 */
	public Regex() {
		super();
		// Pattern Class - Defines a pattern (to be used in a search), word you search
		Pattern pattern = Pattern.compile("rat", Pattern.CASE_INSENSITIVE);
		// Matcher Class - Used to search for the pattern, the text where search
		Matcher matcher = pattern.matcher("the rat is running out");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}

	/*
	 * this method returns all numbers secuences found in text
	 */
	public void getOnlyNumbers() {
		// String to be scanned to find the pattern.
		String text = "This order was placed for SKU894722 in 09/12/2012";
				
		Pattern pattern = Pattern.compile("-?\\d+");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
		  System.out.println(matcher.group());
		}
	}
}
