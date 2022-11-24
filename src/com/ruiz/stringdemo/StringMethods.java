package com.ruiz.stringdemo;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getLength();
		checkEmpty();
		demoTrim();
		changeCase();
		demoConcat();
		demoSplitString();

	}
	public static void getLength() {
		//The length() method returns the length of the string or 
		//It returns the count of the total number of characters present in the String.
		String str1 = "Java";
		String str2 = "";
	
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("Java".length());
		System.out.println("Java\n".length());
		System.out.println("Learn Java".length());
	}
	public static void checkEmpty() {
		//This method checks whether the String contains anything or not. 
		//If the java string is empty it returns true, false if it isn't
		String s1 = "";
		String s2 = "hello";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
	}
	public static void demoTrim() {
		//the trim method removes any leading and trailing white spaces
		String s1 = "   hello   ";
		System.out.println(s1+", how are you?");//without the trim method
		System.out.println(s1.trim()+", how are you?");//with trim method
	}
	public static void changeCase() {
		String s1 = "Hello HOW are You?";
		String s2 = "hello how are you?";
		
		//the toLowerCase method converts all characters of the string to lower case
		String s1Lower=s1.toLowerCase();
		System.out.println("Converted to lowercase: "+s1Lower);
		
		//the toUpperCase method converts all characters of the string to upper case
		String s2Upper = s2.toUpperCase();
		System.out.println("Converted to uppercase: "+s2Upper);
	}
	public static void demoConcat() {
		//You can also use the + operator to concatenate two or more strings. 
		//But the Java String class provides the concat() method.This method
		//combines a specific string at the end of another string and ultimately
		//returns a combined string.
		String s1 = "Learn ";
		String s2 = "Java";
		//Concatenate s1 and s2
		System.out.println(s1.concat(s2));// Learn Jave
		//Concatenat s2 to s1
		System.out.println(s2.concat(s1));//JavaLearn
		//------By using + operator ------------
		String s3 = "hello";
		String s4 ="Learners";
			//String s5 = s3.concat(s4); or
		String s5 = s3+s4;
		
		//3 strings are concatenated 
		String message = "Welcome " + "to " + "Java!";
		//Concatenate with numbers or char values
	}
	public static void demoSplitString() {
		/* The split() method divides the string at the specified regex and returns an
		array of substrings. Syntax of the string split() method is:
		string.split(String regex, int limit)
		regex - the string is divided at this regex (can be
		strings)
		limit (optional) - controls the number of resulting
		substrings
		If the limit parameter is not passed, split() returns all possible substrings*/
		String vowels = "a::b::c::d:e";
		String [] result = vowels.split("::");
		System.out.println("result: "+Arrays.toString(result));
		
	}
}
