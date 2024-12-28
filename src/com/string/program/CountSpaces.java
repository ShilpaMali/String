package com.string.program;

//4. Write a java program to count the spaces in given string.

public class CountSpaces {
	public static void main(String[] args) {

		String s = "I am fine";
		int counter=0; //1
		// System.out.println(s.length());
		for (int i = 0; i < s.length(); i++) { // 0<9
			char ch = s.charAt(i); // 0
			//System.out.println(ch);
			// ch contain I
			if(ch==' ') { //I== , ==
				counter++; 
			}
		}
		System.out.println("Number of spaces is>>"+counter);
	}

}
