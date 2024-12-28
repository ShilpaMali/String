package com.string.program;

public class SampleMethods {
	public static void main(String[] args) {

		String s = "pune"; // velocity will be stored into s variable
		/*
		 * int l = s.length(); System.out.println(l);
		 */
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.compareTo("pune")); // pune.compareTo("pune")
		// pune.compareTo("java")
		System.out.println(s.concat("java"));  //pune, punejava
		System.out.println(s.hashCode());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

}
