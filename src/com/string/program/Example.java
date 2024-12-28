package com.string.program;

import java.util.Scanner;

/*
 * 2. Design method which return student name to that method
 */

public class Example {
	// public is access specifier
		// String is return type
		// getStudent() is method
		public String getStudent(String studentname) {
			return studentname;
			// ajay value is return to getStudent() method
		}

		public static void main(String[] args) {

			// input from user
			System.out.println("Enter the name>>");
			Scanner scanner = new Scanner(System.in); // ajay
			String name = scanner.next(); // name contain ajay
			Example example = new Example();
			String s = example.getStudent(name);
			System.out.println("Student Name>>" + s);
		}

}
